package com.atzsh.spring.controller;

import com.atzsh.spring.dao.EmployeeDao;
import com.atzsh.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author 张 书航
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @RequestMapping(value = "/employee" ,method = RequestMethod.GET)
    public String getAllEmplyee(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

//    @RequestMapping("/")
//    public String getEmplyeeById() {
//        return "employee_list";
//    }
    /**
     * @PostMapping
     * @DeleteMapping
     * @PutMapping
     * @GetMapping      增删改查
     */

    @RequestMapping(value = "/employee",method = RequestMethod.POST)//同一个value的值，用不同的请求方式，可以区分开来
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        //重定向到列表功能（刷新资源）
        return "redirect:/employee";
    }

//    @RequestMapping()
//    public String getById(){
//
//    }

}
