package com.spring_security.DataLoader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring_security.Model.user;
import com.spring_security.Repository.userRepo;

@Component
public class userdataLoader {

	@Bean
	public CommandLineRunner loadData(userRepo userrepo) {
		
		return args -> {
			user user=new user();
			
			
			user.setUsername("narasimha");
			user.setPassword("gurram@9");
			
			userrepo.save(user);
		};
	}
}
