package com.atzsh.spring.factory;

import com.atzsh.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 张 书航
 */
public class UserFactoryBean implements FactoryBean {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
