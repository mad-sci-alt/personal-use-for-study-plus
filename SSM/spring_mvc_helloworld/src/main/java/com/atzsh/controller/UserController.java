package com.atzsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 张 书航
 */
@Controller
public class UserController {

    /**
     * RequestMapping中所有的参数类型：
     * 1.value，处理哪些请求，根据请求值分发目的地址
     * 2.method，处理请求的方法，常见的请求方式除了post只能处理表单提交，其他的请求get处理（RequestMethod中还有很多的其他枚举，可以有时间仅做了解）
     * 3.param，处理请求携带的参数，如果不符合指定要求则不会给返回地址，返回400页面
     * 详细介绍param写法：
     * params：请求中必须有参数
     * !params：请求中不能有参数信息
     * params=value：请求中必须携带指定参数为value的信息
     * params!=value：请求中必须携带参数，但是不能有值为value的参数
     * 4.headers ：感叹号的用法基本与params一致
     */
    @RequestMapping(
            value = {"/success", "/succeed"},
            method = RequestMethod.GET,
            params = {"username", "password!=123456"}//如果当前请求携带的参数中有password为123456的值，则请求不会响应，返回400页面
    )//一个跳转目标可以对应多个请求地址由value设置（多个入口通向多个地址,可以在方法体中进行流程控制）
    //由method的请求方式属性我们又可以派生出各种各样的Mapping,
    // 比如PostMapping、GetMapping等method中的枚举名+Mapping,可以处理对应的请求
    public String hello() {
        return "success";
    }

    @RequestMapping(
            value = "/sucess",
            params = {"username"}
    )
    public String hello(HttpServletRequest request) {
        String username = request.getParameter("username");
        String method = request.getMethod();
        if (username.equals("张三"))//请求参数为张三才返回success.html页面
            return "success";
        return "error";//否则返回其他页面
    }

    @RequestMapping("/testpojo")
    public String hello1() {
        return "success";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        request.setAttribute("teleScope", "hello,servletAPI");//以键值对的方式存储一对数据到request域中
        return "success";
    }
}
