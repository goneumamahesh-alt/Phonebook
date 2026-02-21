package com.entity;

import java.io.Serializable;

public class User implements Serializable {
private int id;
private String name;
private String email;
private String password;
public User() {
	  
  }
  public int getId() {
	return id;
  }
  public void setId(int i) {
	this.id = i;
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
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  public void setId1(int int1) {
	// TODO Auto-generated method stub
	
  }
}
  