package com.atzsh.mybatis.mapper;

import com.atzsh.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 张 书航
 * select功能比起其他三个更加的灵活多变，
 * 因此我们可以单独创建一个mapper及其对应的配置文件
 */
public interface SelectMapper {
    User selectUserById(@Param("id") int id);
    List<User> selectAllUser();
    User loginCheck(@Param("username")String username,@Param("pw")String pw);
    User loginCheckByMap(Map<String,Object> user);
    int getCount();
    Map<String,Object> getCountByIdToMap(@Param("id") Integer id);
    /**
     * 通过MapKey指定一个map的键为外层大map的键（通常为数据库实体的主键因为是唯一标识且不为空的），
     * 就可以用map套map的方式实现map结构存储多条数据的每条数据的键值对
     * 这种在查询数据不为实体数据类型的情况下使用，如果数据全为实体对应的数据类型，则不需要使用MapKey，可以使用list集合存储
     */
    @MapKey("id")
    Map<String,Object> getMultiUserToMap(@Param("name") String username);
    List<User> getUserByLike(@Param("mohu") String mohu);
}
