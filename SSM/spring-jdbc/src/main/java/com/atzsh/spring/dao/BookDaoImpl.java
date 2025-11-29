package com.atzsh.spring.dao;

import com.atzsh.spring.pojo.TUser;
import com.atzsh.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    //通过id扣图书库存
    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        jdbcTemplate.update(sql, bookId);
    }

    //扣用户余额
    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ? ";
        jdbcTemplate.update(sql, price, userId);
    }

    @Override
    public void getAllUser() {
        String sql = "select * from t_user";
        List<TUser> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TUser.class));
        userList.forEach(System.out::println);
    }
}
