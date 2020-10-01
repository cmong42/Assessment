package com.mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			// Step - 1 - Load Driver
//			Class.forName("com.mysqldemo.Demo1");
			

			// Step - 2 - Open Connection(url,username,password)
			Class.forName("com.mysqldemo.Demo2");
			System.out.println("Driver Loaded Successfully");
			String url = "jdbc:mysql://localhost:3306/bms";
			String username = "root";
			String password = "password";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection sucessful");
			
			//Step - 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select id,name,age,teamName,gender,city from player";
			System.out.println("Statement Created");
			
			//Step - 4 - Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step - 5 - Process Results
			statement.executeUpdate("INSERT INTO player (id, name, age, city, gender, teamName)"+"VALUES (5, 'Gray', 22, 'Hallowdark', 'F', 'TeamTwo')");
			System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step - 6 - Close Connection 
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
//Recreate the same and try doing Insert to the player table using Statement object only