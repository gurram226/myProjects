package com.spring_security.controller;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.kafka.ProducerService;

@RestController
@RequestMapping("/kafka")
public class kafkaController {

	
	
	private ProducerService producerService;
	
	public kafkaController(ProducerService producerService) {
		this.producerService=producerService;
	}
	
	@GetMapping("/sending")
	public ResponseEntity<String> sendMessage(@RequestParam("message") String message){
		
		producerService.sendMessage(message);
		
		return ResponseEntity.ok("message sent");
		
	}
	
	
	
}
