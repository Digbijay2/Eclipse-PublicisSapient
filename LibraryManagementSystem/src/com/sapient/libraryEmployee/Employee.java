package com.sapient.libraryEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.libraryManager.Manager;

public class Employee {
	public int empid;
	private String empname;
	private String bookname;
	
	public Employee(int empid) {
		
		try {
			Connection connection = Manager.getConnection(); 
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select name, bookname from library where id=" + empid);
			
			String name=null, book=null;
			while(resultSet.next()) {
				name = resultSet.getString("name");
				book = resultSet.getString("bookname");
			}
			
			this.empid = empid;
			this.empname = name;
			this.bookname = book;
			
			statement.close();
			connection.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public int getEmpid() {
		return empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	

}
