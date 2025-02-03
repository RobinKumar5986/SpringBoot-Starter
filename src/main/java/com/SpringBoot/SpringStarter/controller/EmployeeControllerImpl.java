package com.SpringBoot.SpringStarter.controller;


import com.SpringBoot.SpringStarter.dto.EmployeeDto;
import com.SpringBoot.SpringStarter.service.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmployeeControllerImpl implements EmployeeController {
    EmployeeServices employeeServices;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeServices.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id) {
        EmployeeDto employeeDto = employeeServices.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }
}
