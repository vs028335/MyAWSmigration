package com.sears.SpringBootLearn.Pojo;

import javax.persistence.Entity;

import org.springframework.stereotype.Controller;

@Entity
public class PersonDetails {

	String name;
	String email;
	int mobile;
	String Password;

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

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
