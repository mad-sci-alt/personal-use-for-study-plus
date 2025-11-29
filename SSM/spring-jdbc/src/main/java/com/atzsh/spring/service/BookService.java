package com.atzsh.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author 张 书航
 */

public interface BookService {

    default void buyBook(Integer booId,Integer userId){
        System.out.println("卖出了一本书");
    }

    void getAllUser();
}
