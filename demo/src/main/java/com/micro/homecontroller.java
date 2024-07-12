package com.micro;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class homecontroller{
@Autowired
userServiceImp u;
@Autowired
RestTemplate t;
@GetMapping("/{userId}")
public user getUser(@PathVariable int userId) {
	user u1= u.getUser(userId);
	try {
	List<contact>c=t.getForObject("http://contact-service/contact/"+userId,List.class);
	
	u1.setContacts(c);
	
	return u1;
	}
	catch(Exception e){
		System.out.println("in catch");
		return u1;
	}
}
//testing code for sy=cynchronized calling between 2 micro services. performance in very very poor in respect of ayschronus calling using kafka
@GetMapping("/update")
public void fun()
{   for(int i=0;i<200000;i++) {
	String s=t.getForObject("http://contact-service/contact/demo",String.class);
	System.out.println(s);
    }
}
}
