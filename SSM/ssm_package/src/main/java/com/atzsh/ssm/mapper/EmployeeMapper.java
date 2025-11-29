package com.atzsh.ssm.mapper;

import com.atzsh.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张 书航
 */
@Repository
public interface EmployeeMapper {
    Employee getEmployeeById(@Param("id") Integer id);
    List<Employee> getEmployeeList();
    int addEmployee();
    int deleteEmployeeById(@Param("id") Integer id);
    int updateEmployeeById();
    List<Employee> getEmployeeByLimit(@Param("arr")int[] idList);

}
