package com.atzsh.ssm.controller;

import com.atzsh.ssm.pojo.Employee;
import com.atzsh.ssm.service.EmployeeService;
import com.atzsh.ssm.service.impl.EmployeeServiceImpl;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 张 书航
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(
            value = "/employee/page/{pageNum}",
            method = RequestMethod.GET)
    public String getEmployeeList
            (Model model, @PathVariable("pageNum") Integer pageNum) {
        PageInfo<Employee> page = employeeService.getEmployeeList(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }

}
