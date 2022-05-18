package com.springboot_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_webapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
