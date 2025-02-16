package com.spring_security.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring_security.Model.user;

@Service
public class jsonKafkaConsumer {

	
	private static final Logger logg=LoggerFactory.getLogger(jsonKafkaConsumer.class);
	
	@KafkaListener(topics = "narasimha_json" , groupId = "naniGroup")
	public void receiveMessages(user user) {
		
		logg.info(String.format("object received -> %s", user.toString()));
	}
	
}
