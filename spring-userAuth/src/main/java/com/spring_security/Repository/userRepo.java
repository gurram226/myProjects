package com.spring_security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_security.Model.user;

@Repository
public interface userRepo  extends JpaRepository<user,Integer>{
	

	user findByUsername(String username);
	
}
