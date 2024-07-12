package com.example.contats;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class contactController{
@Autowired
contactServiceImpl u;
@GetMapping("/{k}")
public List<contact> getContact(@PathVariable("k") int userId)
{
	return u.getContact(userId);
}
@GetMapping("/demo")
public String demo()
{    
	 Random rand = new Random();
	
		String s="Location "+ rand.nextInt(100-1+1);
		return s;
	     
}
}
