package EncapFound;

import java.util.Scanner;

/**
 * @author 张 书航
 */
public class Homework02 {
    static Scanner sc = new Scanner(System.in);

    static String inputName(String name) {
        name = sc.next();
        if (!(name.length() < 5 && name.length() > 1))
            throw new RuntimeException("用户名长度应为2-4，还剩一次机会重新输入");
        return name;
    }

    static String inputPw(String pw) {
        pw = sc.next();
        if (!(pw.length() == 6 && pw.matches("\\d+")))
            throw new RuntimeException("密码长度为6且全为数字，请重新输入");
        return pw;
    }

    static String inputEm(String em) {
        em = sc.next();
        if (!(em.indexOf(".") != -1 && em.indexOf("@") != -1 &&
                em.indexOf("@") < em.indexOf(".")))
            throw new RuntimeException("邮箱格式必须为xxx@xx.com");
        return em;
    }

    public static void main(String[] args) {

        String name = null;
        String pw = null;
        String em = null;

        try {
            System.out.println("请输入用户名");
            name = inputName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            name = inputName(name);
        }
        try {
            System.out.println("请输入密码");
            pw = inputPw(pw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pw = inputPw(pw);
        }
        try {
            System.out.println("请输入邮箱");
            em = inputEm(em);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em = inputEm(em);
        }
        /// 逻辑混在一起了，分开结构更加清楚，而且各部分错误独立报错，错误类型更加清楚
//        try {
//            name = sc.next();
//            pw = sc.next();
//            em = sc.next();
//            if (!(name.length() < 5 && name.length() > 1 && pw.length() == 6
//                    && pw.matches("\\d+") && em.indexOf("@") != -1 &&
//                    em.indexOf(".") != -1 && em.indexOf("@") < em.indexOf(".")))
//                throw new RuntimeException("用户名长度为2-4，密码长度为6且全为数字，邮箱格式必须为xxx@xx.com");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        UserRegister user = new UserRegister(name, pw, em);
        System.out.println(user);

    }
}

class UserRegister {
    private String name;
    private String pw;
    private String email;


    public UserRegister(String name, String pw, String email) {
        this.name = name;
        this.pw = pw;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "注册成功" + "\n" + "用户名：" + name + "\n" +
                                  "密码：" + pw + "\n" +
                                  "邮箱：" + email;
    }
}