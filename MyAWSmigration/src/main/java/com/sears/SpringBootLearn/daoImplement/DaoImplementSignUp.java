package com.sears.SpringBootLearn.daoImplement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.sears.SpringBootLearn.Pojo.PersonDetailsSignUP;
import com.sears.SpringBootLearn.daoInterface.DaoInterfaceSignUp;

@Service
public class DaoImplementSignUp implements DaoInterfaceSignUp {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	PersonDetailsSignUP personDetails;
	
	@Override
	public void createPersionDetails(PersonDetailsSignUP personDetails) {
		String sql = "insert into signUp(emailid,name,mobile,password) values(?,?,?,?)";
		if(jdbcTemplate == null) {
			System.out.println("jdbcTemplate is null");
		}
		int status = jdbcTemplate.update(sql, new Object[] { personDetails.getEmail(), personDetails.getName(), personDetails.getMobile(),
				personDetails.getPassword()});
		if(status>0)
			System.out.println("Successfully Stored..");
		else 
			System.out.println("Not added");
	}

}
