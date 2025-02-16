package com.spring_security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_security.model.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee,  Integer>{

	
	
	//public employee findByUsername(String username);
}
