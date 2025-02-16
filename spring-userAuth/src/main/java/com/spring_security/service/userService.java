package com.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_security.Model.user;
import com.spring_security.Repository.userRepo;
import com.spring_security.exception.userNotFoundException;

@Service
public class userService {

	@Autowired
	public userRepo userrepo;
	
	
	
	public user authUser(String username, String password) throws userNotFoundException {
		
		user user=userrepo.findByUsername(username);
		
		if(user.equals(null)) {
			throw new userNotFoundException("user not found");
		}
		
		if(!(user.getPassword().equals(password))) {
			throw new userNotFoundException("Incorrect password");
			
		}
		
		return user;
	}
	
}
