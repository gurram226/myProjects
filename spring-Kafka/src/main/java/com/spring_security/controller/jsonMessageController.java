package com.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.Model.user;
import com.spring_security.kafka.jsonKafkaProducer;

@RestController
@RequestMapping("/jsonkafka")
public class jsonMessageController {

	@Autowired
	jsonKafkaProducer jsonkafkaproducer;

	public jsonMessageController(jsonKafkaProducer jsonkafkaproducer) {
		this.jsonkafkaproducer = jsonkafkaproducer;
	}
	
	
	@PostMapping("/sendToTopic")
	public ResponseEntity<String> sendMessageJson(@RequestBody user user)
	{
		jsonkafkaproducer.sendMessage(user);
		
		return ResponseEntity.ok("sent to Topic");
	}
	
}
