package com.employee.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.address.model.address;
import com.employee.address.response.addressResponse;
import com.employee.address.service.addressService;

@RestController
@RequestMapping("/address")
public class addressController {

	
	@Autowired
	addressService addressServ;
	

	@PostMapping("/save")
	public ResponseEntity<addressResponse> savingAddress(@RequestBody address add) {
		
		addressResponse address=addressServ.saveaddress(add);
		
	return 	ResponseEntity.ok(address);
		
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<addressResponse> getAddressByID(@PathVariable int id){
		addressResponse response=addressServ.getAddressByID(id);
		return ResponseEntity.ok(response);
		
		
	}
	
	
	
	
}
