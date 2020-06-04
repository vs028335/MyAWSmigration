package com.sears.SpringBootLearn.daoInterface;

import org.springframework.stereotype.Repository;

import com.sears.SpringBootLearn.Pojo.PersonDetailsSignUP;

@Repository
public interface DaoInterfaceSignUp {

	void createPersionDetails(PersonDetailsSignUP personDetails);

}
