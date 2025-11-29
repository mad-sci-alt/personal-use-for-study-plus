package com.atzsh.spring;

import com.atzsh.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张 书航
 */
public class AopByXmlTest {
    @Test
    public void testXmlAop(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext(
                        "aop-xml.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1,1);
        bean.div(1,2);
    }
}
