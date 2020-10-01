package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static Connection connection;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysqldemo.JDBCDemo1.App");
		String url = "jdbc:mysql://localhost:3306/bms";
		String username = "root";
		String password = "password";
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}