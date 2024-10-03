package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
