package com.atzsh.spring.service.impl;

import com.atzsh.spring.service.BookService;
import com.atzsh.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张 书航
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;

    @Override
    @Transactional
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
