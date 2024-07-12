package com.kafkaproducer.kafkaProducer;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class controller {
@Autowired
userService s;
@PostMapping("/update")
public ResponseEntity<?> user()
{   Random rand = new Random();
	for(int i=0;i<200000;i++) {
	s.producer("Location "+ rand.nextInt(100-1+1) );
     }
	return new ResponseEntity<>("updated",HttpStatus.OK);
}
}
