package com.greatlearning.EmailApp.main;

public class Employee {

	public String Firstname, Lastname, email,pwd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Employee(String firstname, String lastname) {
		Firstname = firstname;
		Lastname = lastname;
	}
}