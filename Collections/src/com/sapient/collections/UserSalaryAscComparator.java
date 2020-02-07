package com.sapient.collections;

import java.util.Comparator;

public class UserSalaryAscComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return (int)(o1.getSalary() - o2.getSalary()) ;
	}

}
