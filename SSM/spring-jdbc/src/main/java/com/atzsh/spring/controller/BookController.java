package com.atzsh.spring.controller;

import com.atzsh.spring.pojo.User;
import com.atzsh.spring.service.BookService;
import com.atzsh.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author 张 书航
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public CheckoutService getCheckoutService() {
        return checkoutService;
    }

    public void setCheckoutService(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public BookController() {
    }

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }

    public void getAllUser() {
        bookService.getAllUser();
    }

    public void checkout(Integer[] bookIds, Integer userId){
        checkoutService.checkout(bookIds,userId);
    }
}
