package com.atzsh.spring;


import com.atzsh.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        int result = jdbcTemplate.update(sql, "张三", "123", 23, "男", "123@qq.com");//返回受影响的行数，JdbcTemplate的update方法涵盖了增删改三种操作
        System.out.println(result);
    }

    @Test
    public void testGetUserById() {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void getAllUser() {
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        userList.forEach(System.out::println);
    }

    @Test
    public void selectCountNum() {
        String sql = "select count(*) from t_user";
        Integer num = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println("当前表中有"+num+"条数据");
    }
}
