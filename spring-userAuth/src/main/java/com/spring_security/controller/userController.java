package com.spring_security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.Model.user;
import com.spring_security.exception.userNotFoundException;
import com.spring_security.service.userService;

@RestController
@RequestMapping("/user")
public class userController {

	
	@Autowired
	public userService userService;
	
	
	@PostMapping("/auth")
	public String authUsers(@RequestParam String username, @RequestParam String password) {
		
		try {
			userService.authUser(username, password);
			return "login succesful";

			
		} catch (userNotFoundException e) {
			
			e.printStackTrace();
			
			return "login failed" +e.getMessage();
		}
		
		
		
	}
	
}
