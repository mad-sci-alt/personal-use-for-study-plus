package com.atzsh.spring.controller;

import com.atzsh.spring.dao.EmployeeDao;
import com.atzsh.spring.entity.Employee;
import org.aopalliance.intercept.Invocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
@Controller
public class TestRestController {
    @Autowired
    EmployeeDao employeeDao;

//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

//    @RequestMapping(
//            value = "/user",
//            method = RequestMethod.GET
//    )
//    public String getAllUser() {
//        return "user";
//    }

//    @RequestMapping(
//            value = "/user",
//            method = RequestMethod.GET
//    )
//    public String getUserById() {
//        System.out.println("根据id查询用户信息-->/user/1-->get");
//        return "user";
//    }


    //花钱买教训！！！
    //注意入口不能重复，如果重复了还不注释，那你就得在相关配置文件中排除这个类！！！
    //要不然IDE无法识别到底用哪个就会报错ambiguous map，模糊的映射

   // 根本原因。
//    org.springframework.beans.factory.BeanCreationException:
//    Error creating bean with name 'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping':
//    Invocation of init method failed;
//    nested exception is java.lang.IllegalStateException:
//    ⚠️ Ambiguous mapping. Cannot map
//    'testRestController' method
    @RequestMapping(
            value = "/employee",
            method = RequestMethod.GET
    )
    public String getEmployeeList(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";

    }
}
