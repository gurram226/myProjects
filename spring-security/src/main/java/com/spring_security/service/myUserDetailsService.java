package com.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring_security.model.employee;
import com.spring_security.model.userPrincipal;
import com.spring_security.model.users;
import com.spring_security.repo.employeeRepo;
import com.spring_security.repo.userRepo;

@Service
public class myUserDetailsService implements UserDetailsService {
	
	@Autowired
	private userRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		users user=userRepo.findByUsername(username);
		
		if(user==null) {
			System.out.println("employee not found");
			throw new UsernameNotFoundException("employee not found");
		}
		
		return new userPrincipal(user);
	}

	
}
