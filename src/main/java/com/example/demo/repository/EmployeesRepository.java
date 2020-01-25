package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employees;
@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
	
	List<Employees> findByEmployeeName(String employeeName);
  
    List<Employees> findBySalary(Integer salary);

}
