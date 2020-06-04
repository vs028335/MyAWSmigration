package com.controller.Addservice;

import org.springframework.stereotype.Component;

@Component
public class Subservice {

	public int sub(int i,int j)
	{
		return i-j;
	}
}
