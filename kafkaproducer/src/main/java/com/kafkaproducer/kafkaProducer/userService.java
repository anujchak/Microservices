package com.kafkaproducer.kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class userService {
@Autowired
private KafkaTemplate<String, String> k;
public void producer(String s)
{
	this.k.send("user-topic",s);
	System.out.println("hii");
}

}
