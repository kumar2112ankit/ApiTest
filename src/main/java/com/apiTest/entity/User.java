package com.apiTest.entity;

import java.util.Date;




public class User {
	private int id;
	private String name;
	private String email;

	public User() {
	}

	public User(int id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private Date date;

}
