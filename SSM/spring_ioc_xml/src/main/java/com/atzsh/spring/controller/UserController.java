package com.atzsh.spring.controller;

import com.atzsh.spring.service.UserService;

/**
 * @author 张 书航
 */
public class UserController {
    //硬编码不利于维护
//    private UserService userService = new UserServiceImpl();
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
