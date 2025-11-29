package com.atzsh.spring.service.impl;

import com.atzsh.spring.dao.BookDao;
import com.atzsh.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张 书航
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * @param bookId
     * @param userId
     * @Transactional 标签内可以设置的参数:
     * 按照回滚策略有如下:只读不写readOnly=true/false,超时回滚timeout = 3,遇到指定类型异常回滚/不回滚(rollBackFor/noRollbackFor = ArithmeticException.class)
     * 隔离级别 isolation = Isolation.DEFAULT(当前使用的数据库的默认级别)/.READ_UNCOMMITTED/.READ_COMMITTED/REPEATABLE_READ/SERIALIZABLE
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
/// 添加事务注解,保持数据的一致性,即对操作的每一项数据的改变要么全成功,要么全失败
    //REQUIRED整体回滚。REQUIRES_NEW不会整体回滚
    public void buyBook(Integer bookId, Integer userId) {
        //首先根据客户要买的图书的id查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新卖出后的库存数，默认减一写死了，可自己调整
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId, price);
        System.out.println("编号为"+bookId+"的书籍购买成功！");

    }

    @Override
    public void getAllUser() {
        bookDao.getAllUser();
    }
}
