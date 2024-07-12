package com.micro;

import java.util.List;

public class user {
private int userId;
private String userName;
private List<contact> contacts;
public user(int userId, String userName) {
	super();
	this.userId = userId;
	this.userName = userName;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public List<contact> getContacts() {
	return contacts;
}
public void setContacts(List<contact> contacts) {
	this.contacts = contacts;
}
}
