package com.atzsh.spring;

import com.atzsh.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AopByAnnotationTest {

    @Test
    public void testAopByAnnotation() {
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext(
                        "aop-annotation.xml");
//        LoggerAspect bean = ioc.getBean(LoggerAspect.class);
//        bean.beforeAdviceMethod();
        Calculator bean = ioc.getBean(Calculator.class);
        bean.sub(1, 2);
    }
}
