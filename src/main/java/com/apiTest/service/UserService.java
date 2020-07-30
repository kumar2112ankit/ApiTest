package com.apiTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiTest.dao.DaoTest;
import com.apiTest.entity.User;

@Service
public class UserService {
	@Autowired
	private DaoTest test;
	public boolean savemethod(User user) {
		if(test.saveUser(user)!= null) {
			return true;
		}
		else {
			return false;
		}
	}

}
