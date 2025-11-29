package com.atzsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 张 书航
 */

@Controller
public class IndexController {


    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
// @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
// localhost:8080/springMVC/
//    @RequestMapping("/")
//    public String index() {
//        //设置视图名称
//        return "index";
//    }

//index方法注销可以测试mvc:view-controller标签是否能生效
//成功生效，测试下来只有mvc:view-controller标签设置的页面能访问，其他页面都无法跳转
//需要在下面再设置mvc:annotation-driven
}
