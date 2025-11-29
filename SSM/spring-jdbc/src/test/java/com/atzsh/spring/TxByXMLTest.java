package com.atzsh.spring;

import com.atzsh.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 张 书航
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:tx-XML.xml")//一定要指定xml文件路径否则会与基于注解的xml文件冲突
public class TxByXMLTest {
    @Autowired
    private BookController bookController;

    public BookController getBookController() {
        return bookController;
    }

    public void setBookController(BookController bookController) {
        this.bookController = bookController;
    }

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
    }

    @Test
    public void testGetUserDetails() {
        bookController.getAllUser();
    }

    @Test
    public void testBuyMultiBooks() {
        bookController.checkout(new Integer[]{1, 2}, 1);

    }
}