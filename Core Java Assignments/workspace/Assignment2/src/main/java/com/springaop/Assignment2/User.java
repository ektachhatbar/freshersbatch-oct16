package com.springaop.Assignment2;

public class User {
	private String loginname;
	private String password;
	private String firstname;
	private String country;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String loginname, String password, String firstname, String country) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.firstname = firstname;
		this.country = country;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
