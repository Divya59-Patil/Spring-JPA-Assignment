package com.example.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
	
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	
//	List<Employee> findByFirstNameStartingWith(String prefix);
	
//	 List<Employee> findEmployeesWithPermanentAddress();
	
//	List<Employee>findByIsManager();
	
//	List<Employee>findAllDepartmentsWithEmployeeCount();
	
//	List<Employee>findDepartmentsByLocation();
	
	
//	Page<Employee> findAllByOrderByNameAsc(Pageable pageable);
//   Page<Employee> findAllByOrderByNameDesc(Pageable pageable);
	
	
}
