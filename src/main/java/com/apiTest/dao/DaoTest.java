/**
 * 
 */
package com.apiTest.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apiTest.entity.User;

/**
 * @author Kumar
 *

	Jul 28, 2020
 */
@Repository
public class DaoTest {

	@Autowired
	private SessionFactory  sessionFactory;
	
	public User saveUser(User user) {
	
		Session session= sessionFactory.openSession();
		 session.save(user);
		 return null;
		
	}
}
