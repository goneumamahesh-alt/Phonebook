package com.entity;

import java.io.Serializable;

public class Contact implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String about;	
	public Contact() {

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

	public String getPhno() {
		return phone;
	}

	public void setPhno(String phno) {
		this.phone = phno;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	
}
