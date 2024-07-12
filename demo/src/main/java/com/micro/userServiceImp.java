package com.micro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class userServiceImp implements userService{
    List<user> l=List.of(new user(1,"anuj"),
    		new user(2,"dudu"),
    		new user(3,"kudu"));
	public user getUser(int userId) {
		// TODO Auto-generated method stub
		return l.stream().filter(e->e.getUserId()==userId).findAny().get();
	}

}
