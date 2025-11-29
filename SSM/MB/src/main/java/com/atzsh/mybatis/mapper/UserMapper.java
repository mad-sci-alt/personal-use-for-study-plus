package com.atzsh.mybatis.mapper;



import com.atzsh.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 张 书航
 */
public interface UserMapper {

    void insertUser(@Param("username") String username, @Param("pw") String pw);
    void updateUser(@Param("username")String username ,@Param("newname") String newname);
    void deleteAllUser();
    void deleteUserByName(String username);
    void setPwById(@Param("id")Integer id,@Param("pw")String pw);
    void insertFullUser(User user);
    void deleteMoreUserById(@Param("ids")String ids);
    void insertUserReturnId(User user);
    void insertMoreUser(@Param("users") List<User> users);
}
