package com.atzsh.entity;

import java.util.Date;

/**
 * @author 张 书航
 */
public class UserEntity {
    private String username;
    private String password;
    private String email;
    private char sex;
    private Date birthday;//根据生日动态计算年龄
}
