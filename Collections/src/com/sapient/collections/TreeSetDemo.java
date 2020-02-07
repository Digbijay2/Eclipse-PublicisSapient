package com.sapient.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<User> user = new TreeSet<>(new UserSalaryAscComparator());
		User user1 = new User(12, "Harish", 45000);
		User user2 = new User(23, "Vinay", 60000);
		User user3 = new User(67, "Ramesh", 25000);
		User user4 = new User(33, "Kiran", 10000);
		
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		
		Iterator<User> it = user.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
  }
}