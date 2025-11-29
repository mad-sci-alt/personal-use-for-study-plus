package com.atzsh.spring.dao;

/**
 * @author 张 书航
 */
public interface UserDao{

    default void saveUser(){
        System.out.println("保存用户成功");
    }
}
