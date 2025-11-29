package com.atzsh.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author 张 书航
 */
public interface CheckoutService {
    void checkout(Integer[] bookIds,Integer userId);
}
