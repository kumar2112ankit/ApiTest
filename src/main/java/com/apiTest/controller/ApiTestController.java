package com.apiTest.controller;



import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiTest.entity.User;

@RestController
public class ApiTestController {
	
	@GetMapping(value = "/user",produces = {MediaType.APPLICATION_ATOM_XML_VALUE})
	public User getAllUser() {
		System.out.println("ApiTestController.getAllUser()");
		User user=new User();
		user.setId(11);
		user.setName("kumar");
		user.setEmail("abc@abc.com");
		Date date=new Date();
		date.getHours();
		user.setDate(date);
		return user;
		
	}

}
