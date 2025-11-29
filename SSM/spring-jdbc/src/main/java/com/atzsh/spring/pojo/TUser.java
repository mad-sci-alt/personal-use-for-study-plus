package com.atzsh.spring.pojo;

import com.mysql.jdbc.MysqlDataTruncation;

/**
 * @author 张 书航
 */
public class TUser {
    private Integer userId;
    private String userName;
    private  Integer balance;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
