package com.micro.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.micro.microservices.model.employee;

@Repository
public interface emplRepo extends JpaRepository<employee, Integer> {

	
	
	@Query("SELECT e FROM employee e WHERE e.experience > :c")
	List<employee> sortEmployeeByExp(@Param("c") int c); 
	
	
	
}
