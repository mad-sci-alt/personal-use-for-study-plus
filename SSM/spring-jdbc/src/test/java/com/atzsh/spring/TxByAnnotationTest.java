package com.atzsh.spring;

import com.atzsh.spring.controller.BookController;
import com.atzsh.spring.dao.BookDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 张 书航
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(2, 1);
//        System.out.println(new BookDaoImpl().getPriceByBookId(1));
    }

    @Test
    public void testGetUserDetails() {
        bookController.getAllUser();
    }

    /**
     * 测试事务嵌套的事务传播机制
     * 在结账事务中包含买书事务，
     * 只要有买一本书的事务需要回滚（库存不足、用户余额不足），则整个事务都回滚）
     */
    @Test
    public void testBuyMultiBooks() {
        bookController.checkout(new Integer[]{1, 2}, 1);
        //按数组顺序依次进行买书事务，如果遇到异常则按照propagation属性指定的传播机制进行回滚
        // 如果内事务buyBook的propagation属性为REQUIRED，则整个外层事务checkout整体回滚
        //如果为REQUIRED_NEW，则内事务buyBook的异常不会导致外层事务checkout整体回滚，
        // 只会回滚当前异常的内事务，已经完成的buyBook事务不会回滚
        //比如这里买编号为1,2的两本书，
        // 触发checkout事务的用户账号内只能购买第一本本书的钱（和传入的数组内编号的顺序有关），
        // 如果事务策略为REQUIRED，则整个checkout事务回滚，一本书都不会买
        //如果为REQUIRES_NEW,则只会回滚买编号为2的书
        //也是根据实际业务场景选取事务的传播机制为哪种
    }
}
