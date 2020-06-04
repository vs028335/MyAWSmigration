package com.Spring.LernSpring.MobileRamRelation;

public class Ram {

	String size;
	String cname;

	public Ram(String size, String cname) {
		this.size = size;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Ram [size=" + size + ", cname=" + cname + "]";
	}
	
	
}
