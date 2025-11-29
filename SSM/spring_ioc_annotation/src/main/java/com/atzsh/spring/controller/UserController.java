package com.atzsh.spring.controller;

import com.atzsh.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
@Controller
public class UserController {
    @Autowired
//    @Qualifier("userServiceImpl")
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
