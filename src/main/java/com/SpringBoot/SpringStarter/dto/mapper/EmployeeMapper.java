package com.SpringBoot.SpringStarter.dto.mapper;

import com.SpringBoot.SpringStarter.dto.EmployeeDto;
import com.SpringBoot.SpringStarter.entity.Employee;

public class EmployeeMapper {

    public static Employee employeeDtoToEmployeeEntity(EmployeeDto employeeDto) {
        if (employeeDto == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEMail(employeeDto.getEMail());
        return employee;
    }

    public static EmployeeDto employeeEntityToEmployeeDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEMail(employee.getEMail());
        return employeeDto;
    }
}

