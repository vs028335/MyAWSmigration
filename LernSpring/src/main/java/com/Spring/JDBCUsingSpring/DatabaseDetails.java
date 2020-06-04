package com.Spring.JDBCUsingSpring;

public class DatabaseDetails {

	private String dbUsername;
	private String dbUrl;
	private String dbPassword;

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "DatabaseDetails [dbUsername=" + dbUsername + ", dbUrl=" + dbUrl + ", dbPassword=" + dbPassword + "]";
	}

}
