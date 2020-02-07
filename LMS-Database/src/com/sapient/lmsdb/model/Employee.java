package com.sapient.lmsdb.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.lmsdb.model.LeaveDetails;
import com.sapient.lmsdb.service.Manager;

public class Employee {
	public int empId;
	private String empName;
	private String deptName;
	private LeaveDetails leaveDetails;
	
	public Employee (int empid) {
//		
//		this.empId = empId;
//		this.deptName = deptName;
//		this.empName = empName;
//		this.leaveDetails = new LeaveDetails();
		try {
		Connection connection = Manager.getconnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select name, dept from employee where id="+empid);
		
		String name = null,dept = null;
		
		while(resultSet.next())
			{
				name = resultSet.getString("name");
				dept = resultSet.getString("dept");
			}
		
		
		this.empId = empid;
		this.empName = name;
		this.deptName = dept;
		this.leaveDetails = new LeaveDetails(empid);
		
		statement.close();
		connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public int getEmpId() {
		return empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public LeaveDetails getLeaveDetails() {
		return leaveDetails;
	}

	
	
	

}