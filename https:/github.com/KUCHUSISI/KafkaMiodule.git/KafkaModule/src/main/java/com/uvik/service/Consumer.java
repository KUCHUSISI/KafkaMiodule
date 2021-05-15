package com.uvik.service;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.uvik.model.User;

import ch.qos.logback.classic.Logger;


@Service
public class Consumer {

	private static final Logger logger=(Logger) LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics="Hello",groupId = "foo")
	public void receivedData(@Payload String student)
	{
		System.out.println(student.toString());
		logger.info(student.toString());
	}

}