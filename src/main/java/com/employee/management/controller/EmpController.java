package com.employee.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.modal.Employee;

@RestController
public class EmpController {
	@GetMapping("getAllemployees")
	public List<Employee> getAllEmployees() {
		Employee employee = new Employee(1, "Narayana", "Bojja");
		return List.of(employee);

	}
}
