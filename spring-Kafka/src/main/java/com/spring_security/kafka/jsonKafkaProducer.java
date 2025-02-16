package com.spring_security.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.spring_security.Model.user;

@Service
public class jsonKafkaProducer {

	
	private static final Logger logg=LoggerFactory.getLogger(jsonKafkaProducer.class);
	
	
	private KafkaTemplate<String, user> kafkatemplate;


	public jsonKafkaProducer(KafkaTemplate<String, user> kafkatemplate) {
		this.kafkatemplate = kafkatemplate;
	}
	
	
	
	public void sendMessage(user user) {
		
		logg.info(String.format("messae sent to  topic %s", user.toString()));
		
		Message<user> messages=MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC,"narasimha_json").build();
		
		kafkatemplate.send(messages);
		
	}
	

	
}
