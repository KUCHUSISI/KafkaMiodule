package com.uvik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uvik.service.Producer;


@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

	@Autowired(required = true)
    Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String student) 
    {
    	System.out.println(student.toString());
        producer.sendData(student);
    }
}