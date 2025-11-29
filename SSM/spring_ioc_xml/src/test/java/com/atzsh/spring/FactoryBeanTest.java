package com.atzsh.spring;

import com.atzsh.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张 书航
 */
public class FactoryBeanTest {

    @Test
    public void factoryBeanTest() {
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext(
                        "spring-factorybean.xml");
        User user =  ioc.getBean(User.class);
        System.out.println(user);
    }
}
