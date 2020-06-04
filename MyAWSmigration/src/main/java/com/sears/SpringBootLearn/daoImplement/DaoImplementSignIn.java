package com.sears.SpringBootLearn.daoImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.sears.SpringBootLearn.daoInterface.DaoInterfaceSignIn;

@Service
public class DaoImplementSignIn implements DaoInterfaceSignIn {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int checkEmailValidation(String email) {
		System.out.println("I am in checkEmail");
		
		String sql="DELETE FROM `searsdb`.`signUp` WHERE emailid=?";
		int count=jdbcTemplate.update(sql, email);
		
		return count;
	}

}
