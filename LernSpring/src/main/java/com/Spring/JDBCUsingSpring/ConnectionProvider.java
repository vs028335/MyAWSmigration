package com.Spring.JDBCUsingSpring;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static String url;
	static String username;
	static String password;
	
	static Connection connection;

	public static Connection getConn() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);

				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			return connection;
		return connection;
	}

	/*public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		ConnectionProvider.url = url;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		ConnectionProvider.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		ConnectionProvider.password = password;
	}
*/
}