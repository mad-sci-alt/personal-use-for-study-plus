package com.atzsh.spring;

import com.atzsh.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张 书航
 */
public class AutoWireByXML {
    /**
     * autowire字段值（策略） 自动装配：
     * no、default不装配，需要自己手动指定Property值，不设置则为默认值
     * byType、byName通过bean标签的autowire字段值设置自动装配
     */
    @Test
    public void testAutoWireByXML(){
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext(
                        "spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
