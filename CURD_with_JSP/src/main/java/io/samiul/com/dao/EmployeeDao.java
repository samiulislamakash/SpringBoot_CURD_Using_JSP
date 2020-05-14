package io.samiul.com.dao;

import java.util.List;

import io.samiul.com.model.Employee;

public interface EmployeeDao {
	int insert(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee getById(int id);
	List<Employee>getAll();
}
