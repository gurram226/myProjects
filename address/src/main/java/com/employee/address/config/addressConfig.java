package com.employee.address.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class addressConfig {

	

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
