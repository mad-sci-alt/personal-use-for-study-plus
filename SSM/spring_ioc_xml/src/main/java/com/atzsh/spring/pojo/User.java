package com.atzsh.spring.pojo;

/**
 * @author 张 书航
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;

    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User() {
        System.out.println("当前生命周期：1、创建对象");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("当前生命周期：2、依赖注入");
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /// 注：initMethod、destroyMethod方法可由通过bean配置指定为初始化和销毁的方法
    public void initMethod(){
        System.out.println("当前生命周期：4、bean对象初始化");
    }
    public void destroyMethod(){
        System.out.println("当前生命周期：7、bean对象销毁");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
