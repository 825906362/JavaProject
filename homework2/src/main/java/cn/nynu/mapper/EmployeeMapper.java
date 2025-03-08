package cn.nynu.mapper;

import cn.nynu.pojo.Employee;

public interface EmployeeMapper {
    Employee selectById(Integer id);
    Integer insertEmployee(Employee employee);
    Integer deleteEmployee(Integer id);
    Integer updateEmployee(Employee employee);
}
