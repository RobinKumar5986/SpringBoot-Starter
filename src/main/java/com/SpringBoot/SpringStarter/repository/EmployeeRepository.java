package com.SpringBoot.SpringStarter.repository;


import com.SpringBoot.SpringStarter.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
