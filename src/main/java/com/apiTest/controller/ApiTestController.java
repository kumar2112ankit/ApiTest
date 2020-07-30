package com.apiTest.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiTest.entity.User;
import com.apiTest.service.UserService;

@RestController
public class ApiTestController {
	@Autowired
	private UserService serive;
	//tacking the request
	@GetMapping(value = "/user")
	public String getAllUser() {
		System.out.println("ApiTestController.getAllUser()");
		User user=new User();
		user.setName("alfa");
		user.setEmail("email@kjhskdjgf");
		boolean t=serive.savemethod(user);
		if(t=true) {
			return "registerd";
		}
		else 
			return "faild";
		
	}

}
