package com.example.contats;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class contactServiceImpl implements contactService {
    List<contact>l=List.of(new contact(1,1,"@gmail","7595855343"),
    		new contact(1,1,"1@gmail","7595855343"),
    		new contact(1,2,"2@gmail","7595855343"),
    		new contact(1,1,"2@gmail","7595855343"),
    		new contact(1,4,"3@gmail","7595855343"),
    		new contact(1,2,"2@gmail","7595855343"));
	@Override
	public List<contact> getContact(int userId) {
		// TODO Auto-generated method stub
		List<contact>l1= l.stream().filter(e->e.getUserId()==userId).toList();
		System.out.println(l1);
		if(l1.isEmpty())
		{
			int n=5/0;
		}
		return l1;
	}

}
