package com.sears.SpringBootLearn.servicesIImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.daoImplement.DaoImplementSignIn;
import com.sears.SpringBootLearn.services.ServiceInterfaceSignIn;

@Component
public class ServicesImpleSignIn implements ServiceInterfaceSignIn {

	@Autowired
	DaoImplementSignIn daoImplementSignIn;
	
	@Override
	public int checkEmail(String email) {
		return	daoImplementSignIn.checkEmailValidation(email);
	}
}
