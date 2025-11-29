package com.atzsh.spring.service.impl;

import com.atzsh.spring.dao.UserDao;
import com.atzsh.spring.service.UserService;

/**
 * @author 张 书航
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
