package com.sears.SpringBootLearn.daoInterface;

import org.springframework.stereotype.Repository;

@Repository
public interface DaoInterfaceSignIn {

//	public void checkEmailValidation(String email);
	public int checkEmailValidation(String email);
}
