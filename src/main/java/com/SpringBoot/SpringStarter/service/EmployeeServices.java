package com.SpringBoot.SpringStarter.service;


import com.SpringBoot.SpringStarter.dto.EmployeeDto;

public interface EmployeeServices {
    EmployeeDto createEmployee(EmployeeDto employee);

    EmployeeDto getEmployeeById(Long id);
}
