package com.spring_security.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.model.employee;
import com.spring_security.service.employeeService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	employeeService empserv;
	
	
	
	/*
	 * @GetMapping("/get-emp") public List<employee> saveEmployee(employee emp) {
	 * 
	 * return empserv.saveemployee(emp);
	 * 
	 * 
	 * 
	 * }
	 */

	
	@GetMapping("/get")
	public String getAllData(HttpServletRequest req) {
		
		return "hi hello   "+req.getSession().getId();
	}
	
	
	
	
	  @PostMapping("/save")
	  public ResponseEntity<employee> saveemp(@RequestBody employee emp ) {
	  
		  employee empp= empserv.saveemployee(emp);
		  
		  return ResponseEntity.ok(HttpStatus.ACCEPTED).ok(empp);
		  
		  
	 }
	
	
	
	
	  @GetMapping("/getcsrf") 
	  public CsrfToken getcsrf(HttpServletRequest req) {
	  return (CsrfToken) req.getAttribute("_csrf"); 
	  }
	  
	  
	  
	  @GetMapping("/getemp/{id}")
	  public ResponseEntity<Optional<employee>> getemploy(@PathVariable("id") int id) throws Exception {
		  
		  Optional<employee> emp=empserv.getemployee(id);
		  
		  return ResponseEntity.ok(HttpStatus.ACCEPTED).ok(emp);
		  
	  }
	  
	  
	  
	 
	
	
}
