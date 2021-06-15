package com.studenthibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studenthibernate.dao.EmployeeDao;
import com.studenthibernate.model.Employee;
import com.studenthibernate.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employeeObject){
		employeeService.save(employeeObject);
		return employeeObject;
	}
	@GetMapping("employee/{id}")
	public Employee get(@PathVariable int id){
		return employeeService.get(id);
	}
	@DeleteMapping("employee/{id}")
	public String delete(@PathVariable int id) {
		employeeService.delete(id);
		return "Employee id has Been Deleted "+id;
	}
}
