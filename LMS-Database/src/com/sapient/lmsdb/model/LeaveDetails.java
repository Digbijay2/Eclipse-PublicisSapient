package com.sapient.lmsdb.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.lmsdb.service.Manager;

public class LeaveDetails {
	
	private int leaves;
	
	public LeaveDetails(int empid) throws SQLException { 
//		this.leaves = 20;
		
	}

	public int getLeaves() {
		return leaves;
	}

	public void updateLeaves(int leaves) {
		this.leaves = this.leaves + leaves;
	}
	
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	

}