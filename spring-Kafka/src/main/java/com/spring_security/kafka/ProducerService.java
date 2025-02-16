package com.spring_security.kafka;

import java.lang.System.Logger;
import org.slf4j.LoggerFactory;


import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(ProducerService.class);
	
	private KafkaTemplate<String, String> kafkatemp;
	
	public ProducerService(KafkaTemplate<String, String> kafkatemp) {
		this.kafkatemp=kafkatemp;
	}
	
	public void sendMessage(String message)
	{
		log.info(String.format("message sent", message));
		
		kafkatemp.send("narasimha",message);
	}
}
