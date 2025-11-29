package com.atzsh.spring;

import com.atzsh.spring.controller.UserController;
import com.atzsh.spring.dao.UserDao;
import com.atzsh.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

/**
 * @author 张 书航
 */
public class AutoWireByAnnotation {
    @Test
    public void testAutoWireByAnnotation() {
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        UserController userController = ioc.getBean("userController", UserController.class);
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        userController.saveUser();
    }
}
