package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employees;
import com.example.demo.repository.EmployeesRepository;

@Service
public class EmployeeServices {
	@Autowired
	EmployeesRepository employeeRepository;

	public Employees employeeSave(Employees employees) {

		Employees dfghjkl = employeeRepository.save(employees);

		return dfghjkl;

	}

	public String employeeUpdate(Employees employees)

	{
//		Optional<Employees> empId=employeeRepository.findById(employees.getEmployeeId());
//		
//		

		List<Employees> namesList = employeeRepository.findByEmployeeName("hari");
		System.out.println("names list= " + namesList);
		System.out.println("names count= " + namesList.size());

   
		                    List<Employees> salaryList =  employeeRepository.findBySalary(30000);
		
		System.out.println("salary list"+salaryList);
		System.out.println("salary list"+salaryList.size());
		
		
		if (employeeRepository.existsById(employees.getEmployeeId())) {
			Employees empupdate = employeeRepository.save(employees);

			return "successfully update";
		}

		else {

			return "data not found";

		}

	}

}
