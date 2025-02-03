package com.SpringBoot.SpringStarter.controller;


import com.SpringBoot.SpringStarter.dto.EmployeeDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/v1/employee")
public interface EmployeeController {
    @Operation(summary = "Create a new employee", description = "Adds a new employee to the system")
    @PostMapping
    ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto);

    @Operation(summary = "Get an employee by ID", description = "Retrieves an employee from the system by their ID")
    @GetMapping("/{id}")
    ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id);

}
