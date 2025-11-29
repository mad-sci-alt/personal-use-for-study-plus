package com.atzsh.spring.dao;

/**
 * @author 张 书航
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);

    void getAllUser();
}
