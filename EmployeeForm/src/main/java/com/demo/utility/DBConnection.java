package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			// 2. Open the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false","root","dani3264");
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		} finally {
			return conn;
		}
	}
}
