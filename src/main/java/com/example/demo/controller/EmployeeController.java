package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeeServices;

@RestController
@RequestMapping("/Employ")
public class EmployeeController {
	@Autowired
	EmployeeServices employeeServices;

//	@RequestMapping(name = "/saveemp", method = RequestMethod.post)
	@PostMapping("/saveemp")
	public Employees empsave(@RequestBody Employees employee) {
		Employees employeeSave = employeeServices.employeeSave(employee);

		return employeeSave;

	}

	@PutMapping("/update")
	public String empupdate(@RequestBody Employees employee) {

		String employees = employeeServices.employeeUpdate(employee);

		return employees;

	}

}