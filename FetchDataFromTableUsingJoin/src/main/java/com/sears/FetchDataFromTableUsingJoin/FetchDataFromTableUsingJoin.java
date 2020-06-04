package com.sears.FetchDataFromTableUsingJoin;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataFromTableUsingJoin {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void fetchDataUsingJoin() {
		String sql = "select * from borrower right join loan on borrower.loan_no=loan.loan_no\r\n";
		jdbcTemplate.query(sql, new EmployeerowMapper());
	}
}
