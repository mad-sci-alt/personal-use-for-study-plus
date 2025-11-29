package com.atzsh.ssm.service.impl;

import com.atzsh.ssm.mapper.EmployeeMapper;
import com.atzsh.ssm.pojo.Employee;
import com.atzsh.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张 书航
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Employee> getEmployeeList(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        PageInfo<Employee> page = new PageInfo<>(employeeList, 5);
        return page;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return null;
    }

    @Override
    public int addEmployee() {
        return 0;
    }

    @Override
    public int deleteEmployeeById(Integer id) {
        return 0;
    }

    @Override
    public int updateEmployeeById() {
        return 0;
    }

    @Override
    public List<Employee> getEmployeeByLimit(int[] idList) {
        return List.of();
    }
}
