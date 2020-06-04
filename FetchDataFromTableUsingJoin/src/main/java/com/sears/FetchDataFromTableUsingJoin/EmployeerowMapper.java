package com.sears.FetchDataFromTableUsingJoin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class EmployeerowMapper implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet rs) throws SQLException {

		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			
			  System.out.print(rs.getString(5)+"\t");
			 
			System.out.println();
		}
	}

}
