package com.atzsh.spring.test;

import com.atzsh.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class HelloWorldTest {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml ");
//        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        HelloWorld helloworld = ioc.getBean(HelloWorld.class);//根据class获取会自动转为该类型（底层用了泛型的机制）
        helloworld.sayHello();
    }
}
