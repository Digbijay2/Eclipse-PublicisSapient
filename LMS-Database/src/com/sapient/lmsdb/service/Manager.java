package com.sapient.lmsdb.service;

import com.sapient.lmsdb.exception.InsufficientLeaveBalanceException;
import com.sapient.lmsdb.model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {

	public static Connection getconnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "1234@1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public int applyForLeave(Employee employee, int numberOfDays)
			throws SQLException, InsufficientLeaveBalanceException {

		// Connection connection = Manager.getconnection();
		int availableleaves = 0;
		try {
			Connection connection = Manager.getconnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select leaveBalance from employee where id =" + employee.empId);

			while (resultSet.next()) {
				availableleaves = resultSet.getInt("leaveBalance");
			}

			if (availableleaves < numberOfDays) {
				throw new InsufficientLeaveBalanceException("Insufficient leave balance");
			} else {
				availableleaves = availableleaves - numberOfDays;
				statement.executeUpdate(
						"update employee set leaveBalance =" + availableleaves + " where id=" + employee.empId);
			}
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return numberOfDays;
		// int availableLeaves = employee.getLeaveDetails().getLeaves();

	}

	public int viewLeaveBalance(Employee employee) {
		int leaves = 0;
		try {
			Connection connection = Manager.getconnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select leaveBalance from employee where id =" + employee.empId);

			while (resultSet.next()) {
				leaves = resultSet.getInt("leaveBalance");
			}

			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return leaves;

	}

	public void updateLeaves(Employee employee, int numberOfDays) throws SQLException {
		// employee.getLeaveDetails().updateLeaves(numberOfDays);

		int availableleaves = 0;
		try {
			Connection connection = Manager.getconnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select leaveBalance from employee where id =" + employee.empId);

			while (resultSet.next()) {
				availableleaves = resultSet.getInt("leaveBalance");
			}
				availableleaves = availableleaves + numberOfDays;
				statement.executeUpdate(
						"update employee set leaveBalance =" + availableleaves + " where id=" + employee.empId);
			
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// int availableLeaves = employee.getLeaveDetails().getLeaves();

	}

}