package com.spring_security.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class consumerService {

	
	private final static Logger log=LoggerFactory.getLogger(consumerService.class);
	
	@KafkaListener(topics = "narasimha" , groupId = "naniGroup")
	public void receiveMessage(String message)
	{
		log.info(String.format("message rereived ->%s",message));
	}
}
