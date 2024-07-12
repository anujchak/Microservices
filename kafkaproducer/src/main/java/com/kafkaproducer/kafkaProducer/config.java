package com.kafkaproducer.kafkaProducer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class config {

	public NewTopic topic()
	{
		return TopicBuilder.name("user-topic").build();
	}
}
