package com.atzsh.mybatis;

import com.atzsh.mybatis.mapper.SelectMapper;
import com.atzsh.mybatis.mapper.UserMapper;
import com.atzsh.mybatis.pojo.User;
import com.atzsh.mybatis.util.SqlSessionTool;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author 张 书航
 */
public class SpecialSqlTest {
    @Test
    void getUserByLike() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> KeySet = mapper.getUserByLike("书");
        System.out.println(KeySet);
    }

    @Test
    void deletMoreUser() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteMoreUserById("2,3");
        sqlSession.commit();
    }

    void JDBCTest() throws ClassNotFoundException {
        Class.forName("");

    }

    @Test
    void insertUserReturnKey() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "张三", "123", 18, "男", "123@123.com");
        System.out.println(user);
        System.out.println("开始插入数据");
        mapper.insertUserReturnId(user);
        System.out.println(user);
        sqlSession.commit();
    }

    @Test
    void insertMoreUserTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(null, "李四", "123", 18, "男", "123@123.com");
        User user2 = new User(null, "王五", "123", 18, "男", "123@123.com");
        User user3 = new User(null, "二狗", "123", 18, "男", "123@123.com");
        List<User> users = Arrays.asList(user1, user2, user3);
        mapper.insertMoreUser(users);
        sqlSession.commit();
    }
}
