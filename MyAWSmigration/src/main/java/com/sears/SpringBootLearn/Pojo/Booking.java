package com.sears.SpringBootLearn.Pojo;

import org.springframework.stereotype.Component;

@Component
public class Booking {

	private String name;
	private int room_no;
	private int mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
}
