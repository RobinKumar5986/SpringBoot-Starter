package com.SpringBoot.SpringStarter.service.impl;


import com.SpringBoot.SpringStarter.dto.EmployeeDto;
import com.SpringBoot.SpringStarter.dto.mapper.EmployeeMapper;
import com.SpringBoot.SpringStarter.entity.Employee;
import com.SpringBoot.SpringStarter.exceptions.ResourceNotFoundException;
import com.SpringBoot.SpringStarter.repository.EmployeeRepository;
import com.SpringBoot.SpringStarter.service.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeServices {

    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.employeeDtoToEmployeeEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.employeeEntityToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with the id: " + id));

        // Assuming you want to map Employee to EmployeeDto
        return EmployeeMapper.employeeEntityToEmployeeDto(employee);
    }
}
