package com.sears.SpringBootLearn.daoImplement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sears.SpringBootLearn.Pojo.PersonDetailsSignUP;

@Component
public class PersonRowMapper implements RowMapper<PersonDetailsSignUP> {

	@Autowired
	PersonDetailsSignUP personDetailsSignUP;

	@Override
	public PersonDetailsSignUP mapRow(ResultSet rs, int rowNum) throws SQLException {

		personDetailsSignUP.setEmail(rs.getString("emailid"));

		return personDetailsSignUP;
	}

}
