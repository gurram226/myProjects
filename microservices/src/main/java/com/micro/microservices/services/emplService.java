package com.micro.microservices.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro.microservices.FeignClient.AddressFeign;
import com.micro.microservices.model.employee;
import com.micro.microservices.repository.emplRepo;
import com.micro.microservices.response.addressResponse;
import com.micro.microservices.response.employeeResponse;

@Service
public class emplService {

	@Autowired
	emplRepo emplRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	AddressFeign addressfeign;
	
//	public employeeResponse  saveEmployee(employeeResponse emp) {
//		
//		employee emp1=modelMapper.map(emp, employee.class);
//		
//		employee emp2=emplRepo.save(emp1);
//		
//		return modelMapper.map(emp2, employeeResponse.class);
//		
//	}
	
	
	
	public employeeResponse saveEmployee(employee emp) {
		employee employee=emplRepo.save(emp);
		employeeResponse emplResponse=modelMapper.map(employee, employeeResponse.class);
		return emplResponse;
		
	}
	
	
	
	
	
	public employeeResponse getEmploy(int id) {
	
	Optional<employee> emp=	emplRepo.findById(id);
	
	employeeResponse empres=modelMapper.map(emp,employeeResponse.class);
	
	
//	addressResponse addressRes=   restTemplate.getForObject("http://localhost:8081/address/get/{id}", addressResponse.class,id);
	
 
	addressResponse addressRes=addressfeign.getAddressres(id);
	 empres.setAddressResponse(addressRes);
	
		return empres;
		
	}
	
	
	
	public List<employee> getSortedEmp(int c){
	
		return emplRepo.sortEmployeeByExp(c);
		
	}
	
	
	
	
	
}
