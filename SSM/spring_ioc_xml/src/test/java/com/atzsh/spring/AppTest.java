package com.atzsh.spring;


import com.atzsh.spring.pojo.Clazz;
import com.atzsh.spring.pojo.Student;
import com.atzsh.spring.pojo.StudentInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testDIBySet() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Student studentOne = ac.getBean("studentFive", Student.class);
//        System.out.println(studentOne);
//        Clazz classThree = ac.getBean("classThree", Clazz.class);
//        System.out.println(classThree);
//        StudentInfo studentSix = ac.getBean("studentSix", StudentInfo.class);
//        System.out.println(studentSix);
        Student bean = ac.getBean("studentOne", Student.class);
        System.out.println(bean);
    }
}
