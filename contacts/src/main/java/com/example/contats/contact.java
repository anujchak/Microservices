package com.example.contats;

public class contact {
private int cId;
private int userId;
private String email;
private String phNo;
public contact() {
	super();
	// TODO Auto-generated constructor stub
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public contact(int cId, int userId, String email, String phNo) {
	super();
	this.cId = cId;
	this.userId = userId;
	this.email = email;
	this.phNo = phNo;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhNo() {
	return phNo;
}
public void setPhNo(String phNo) {
	this.phNo = phNo;
}
}
