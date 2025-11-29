package com.atzsh.mybatis;

import com.atzsh.mybatis.mapper.UserMapper;
import com.atzsh.mybatis.mapper.SelectMapper;
import com.atzsh.mybatis.pojo.User;
import com.atzsh.mybatis.util.SqlSessionTool;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void insertUserTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "张书航",
                "zsh421023", 18, "男", "123@qq.com");
        mapper.insertFullUser(user);
        sqlSession.commit();
        System.out.println("添加成功！");
    }
    @Test
    public void insertUserAdiminTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "admin",
                "zsh421023", 18, "男", "123@qq.com");
        mapper.insertFullUser(user);
        sqlSession.commit();
//        sqlSession.clearCache();手动清除一级缓存（sqlSession级）
        System.out.println("添加成功！");
    }

    @Test
    public void insertTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser("书", "zsh421023");
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser("张书航", "zsh");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteAllUser();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteByNameTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserByName("张书航");
        sqlSession.commit();
        System.out.println("删除成功！");
        sqlSession.close();
    }

    @Test
    public void setPwByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.setPwById(1, "zsh421023");
        sqlSession.commit();
        System.out.println("修改成功！");
        sqlSession.close();
    }


    @Test
    public void loginCheckTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = null;
        try {
            user = mapper.loginCheck("admin", "zsh421023");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null) {
            System.out.println("欢迎！用户" + user.getUsername() + " 登录成功！");
        } else System.out.println("登录失败！用户不存在，请注册");
        sqlSession.close();
    }

    @Test
    public void loginCheckByMapTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = null;
        //由mybatis给的para集合参数自动获取参数引申出手动放集合查找
        //自定义一个map集合以键值对的形式存放要查找的用户数据
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("pw", "zsh421023");
        try {
            user = mapper.loginCheckByMap(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null) {
            System.out.println("欢迎！用户" + user.getUsername() + " 登录成功！");
        } else System.out.println("登录失败！用户不存在，请注册");
        sqlSession.close();
    }


    @Test
    public void selectTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.selectAllUser();
        list.forEach(System.out::println);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectUserByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void getCountTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int count = mapper.getCount();
        System.out.println("共有用户：" + count);
    }

    @Test
    void getCountByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        String name = "张书航";
// {gender=男, pw=zsh421023, id=14, age=18, email=123@qq.com, username=张书航}
//如果键位null则不会保存到map中
        Map<String, Object> user = mapper.getCountByIdToMap(1);
        System.out.println(user);
    }

    @Test
    void getMultiUserToMapTest() throws IOException {
        SqlSession sqlSession = SqlSessionTool.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        String name = "admin";
// {gender=男, pw=zsh421023, id=14, age=18, email=123@qq.com, username=张书航}
//如果键位null则不会保存到map中
        Map<String, Object> user = mapper.getMultiUserToMap(name);
        System.out.println(user);
    }
}
