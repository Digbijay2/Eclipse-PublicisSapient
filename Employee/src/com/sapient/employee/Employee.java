package com.sapient.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class Employee {
	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users", "root", "1234@1234");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee where salary = (select max(salary) from employee);");
			
			int IdNum=0, salary=0, phone=0;
			String Lname=null, Fname=null, Jobcode=null;
			while (resultSet.next()) {
				IdNum = resultSet.getInt("idNum");
				Lname = resultSet.getString("Lname");
				Fname = resultSet.getString("Fname");
				Jobcode = resultSet.getString("Jobcode");
				salary = resultSet.getInt("salary");
				phone = resultSet.getInt("phone");
			}
			System.out.println("Details of employee having maximum salary : " + IdNum +" " + Lname +" " + Fname +" " + Jobcode +" " + salary +" " + phone);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
			
}

