package com.employee.address.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.address.model.address;

@Repository
public interface addressRepo extends JpaRepository<address, Integer>{
	
	
	
	

}
