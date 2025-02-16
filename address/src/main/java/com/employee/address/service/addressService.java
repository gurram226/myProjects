package com.employee.address.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.address.Repo.addressRepo;
import com.employee.address.model.address;
import com.employee.address.response.addressResponse;

@Service
public class addressService {

	
	@Autowired
	addressRepo addressrepo;
	
	
	@Autowired
	ModelMapper modelMapper;
	
	public addressResponse saveaddress(address add) {
		
		
		address addresssave=addressrepo.save(add);
	
		addressResponse addres=modelMapper.map(addresssave, addressResponse.class);
		
		return addres;

	}
	
	
	
	public addressResponse getAddressByID(int id) {
		addressResponse addresForID=modelMapper.map(addressrepo.findById(id), addressResponse.class);
		return addresForID;
		
	}
	
	
	
}
