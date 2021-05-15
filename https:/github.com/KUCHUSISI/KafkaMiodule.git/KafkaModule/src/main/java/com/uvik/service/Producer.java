package com.uvik.service;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import ch.qos.logback.classic.Logger;

import org.springframework.beans.factory.annotation.Value;


@Service
public class Producer {

	Logger logger=(Logger) LoggerFactory.getLogger(Producer.class);
	
	@Autowired
	private KafkaTemplate<String,String>  kafkaTemplate;

	private String topicName="Hello";
	
	public void sendData(String data)
	{
		System.out.println("hey i am in producer class ");
		logger.info(data.toString());
		kafkaTemplate.send(topicName,data);
	}
}