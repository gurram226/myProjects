package com.spring_security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_security.model.employee;
import com.spring_security.repo.employeeRepo;

@Service
public class employeeService {

	
	@Autowired
	employeeRepo employeerepo;
	
	
	//public employee findbyUsername(String name) {
	
	//	employee emp=employeerepo.findbyuname(name);
		
	//	return emp;
	//}
	
	
	public employee saveemployee(employee emp) {
		
		return employeerepo.save(emp);
	}
	
	
	
	public Optional<employee>  getemployee(int id) throws Exception {
	
		return employeerepo.findById(id);
		
		
		
	}
	
	
}
