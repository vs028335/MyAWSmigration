package com.sears.SpringBootLearn.servicesIImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.sears.SpringBootLearn.Pojo.PersonDetailsSignUP;
import com.sears.SpringBootLearn.daoImplement.DaoImplementSignUp;
import com.sears.SpringBootLearn.daoInterface.DaoInterfaceSignUp;
import com.sears.SpringBootLearn.services.ServicesInterfaceSignUp;

@Component
public class ServicesImpleSignUp implements ServicesInterfaceSignUp {

	@Autowired
	DaoImplementSignUp daoimplement;

	@Override
	public void addPersonDetails(PersonDetailsSignUP personDetails){
		daoimplement.createPersionDetails(personDetails);
	}

}
