package com.spring_security.kafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopic {
	
	
	@Bean
	public NewTopic naniTopic() {
		return TopicBuilder.name("narasimha").build();
	}
	
	@Bean
	public NewTopic jsonnaniTopic() {
		return TopicBuilder.name("narasimha_json").build();
	}
	
	

}
