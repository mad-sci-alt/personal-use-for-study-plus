package com.atzsh.spring.dao.impl;

import com.atzsh.spring.dao.UserDao;

/**
 * @author 张 书航
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存用户成功！");
    }
}
