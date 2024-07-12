package com.consumer.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaconfig {
@KafkaListener(topics = "user-topic",groupId = "group-1")
public void updateLocation(String s)
{
	System.out.println(s);
}
}
