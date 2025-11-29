package com.atzsh.ssm.service;

import com.atzsh.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 张 书航
 */
public interface EmployeeService {
    PageInfo<Employee> getEmployeeList(Integer pageNum);

    List<Employee> getEmployeeList();

    int addEmployee();

    int deleteEmployeeById(@Param("id") Integer id);

    int updateEmployeeById();

    List<Employee> getEmployeeByLimit(@Param("arr") int[] idList);

}
