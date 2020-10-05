package com.app.customer.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static Connection connection;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.app.customer.App");
		String url = "jdbc:mysql://localhost:3306/bms";
		String username = "root";
		String password = "password";
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
//SingleTon Java Class