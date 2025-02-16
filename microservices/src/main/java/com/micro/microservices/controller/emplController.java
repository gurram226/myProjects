package com.micro.microservices.controller;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.microservices.model.employee;
import com.micro.microservices.response.employeeResponse;
import com.micro.microservices.services.emplService;

@RestController
@RequestMapping("/employee")
public class emplController {

	@Autowired
	emplService emplServ;
	

//	
//	@PostMapping(path="/save" ,  consumes = "application/json", produces = "application/json")
//	public ResponseEntity savedEmployee(@RequestBody employeeResponse empl){
//		
//	
//		employeeResponse employeeResponse=emplServ.saveEmployee(empl);
//		
//		return ResponseEntity.ok(employeeResponse);
//		
//		
//	}
//	
	
	@PostMapping("/save")
	public ResponseEntity<employeeResponse> saveEmployeee(@RequestBody employee emp){

		employeeResponse emplress= emplServ.saveEmployee(emp);
		
		return ResponseEntity.ok(emplress);
		
	}
	
	
	
	
	
	
	@GetMapping("/getemp/{id}")
	public employeeResponse getEmployees(@PathVariable("id") int id) {

		employeeResponse empllEmployee = emplServ.getEmploy(id);
		return empllEmployee;

	}
	
	
	@GetMapping("/sort")
	public List<employee> getSorted(@RequestParam("c") int c){
		return emplServ.getSortedEmp(c);
		
		
	}
	
	
	
	
}
