package com.sapient.libraryManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.libraryEmployee.Employee;
import com.sapient.libraryManager.*;

public class Manager {
	
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "1234@1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	public void checkBookBalance(Employee employee) {
		int balance=0;
		try {
			Connection connection = Manager.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select Balance from library where id=" + employee.getEmpid());
			
			while(resultSet.next()) {
				balance = resultSet.getInt("Balance");
			}
			
			System.out.println(balance);
			statement.close();
			connection.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void updateBookBalance(Employee employee, int book) throws SQLException {

		int balance = 0;
		try {
			Connection connection = Manager.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select Balance from library where id =" + employee.empid);

			while (resultSet.next()) {
				balance = resultSet.getInt("Balance");
			}
				balance = balance - book;
				statement.executeUpdate(
						"update library set Balance =" + book + " where id=" + employee.empid);
			
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// int availableLeaves = employee.getLeaveDetails().getLeaves();

		
	}

}
