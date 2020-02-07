package com.sapient.lms.model;

public class LeaveDetails {
	
	private int leaves;
	
	public LeaveDetails() {
		this.leaves = 20;
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