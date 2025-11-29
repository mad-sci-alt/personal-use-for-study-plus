package com.atzsh.spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.atzsh.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author 张 书航
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ac.getBean(DruidDataSource.class);
        System.out.println(dataSource.getConnection());

    }

    @Test
    public void testBeanScope() {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1 == user2);
    }

    @Test
    public void testBeanLife() {
        //如果为singleton单例模式，则在ioc容器创建时就创建并初始化对象
        ClassPathXmlApplicationContext ioc =
        new ClassPathXmlApplicationContext(
                "spring-lifestyle.xml");
        //如果为prototype多例模式，则ioc容器创建时就不创建对象，而是等ioc调用getBean方法时才创建对象并初始化对象
        User bean = ioc.getBean(User.class);
        System.out.println("当前生命周期：6、通过IOC容器获取bean并使用");
        bean.destroyMethod();
        ioc.close();
        System.out.println("当前生命周期：7、IOC容器关闭");
    }

}
