package com.studenthibernate.service;

import java.util.List;

import com.studenthibernate.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);

}
