package com.micro.microservices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro.microservices.response.addressResponse;

@FeignClient(name="nani", url = "http://localhost:8081/address") 
public interface AddressFeign {

	
	@GetMapping("get/{id}")
	addressResponse getAddressres(@PathVariable("id") int id);
}
