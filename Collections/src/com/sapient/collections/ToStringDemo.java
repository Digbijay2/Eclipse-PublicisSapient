package com.sapient.collections;

import java.util.HashSet;
import java.util.Set;

public class ToStringDemo {
	public static void main(String[] args) {
		User user1 = new User(1, "Kishan");
		User user2 = new User(2, "Mayank");
		
		Set<User> set = new HashSet<> ();
		set.add(user1);
		set.add(user2);
		System.out.println("Conatins :"+set.contains(user1));
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
	}
}

class User{
	int id;
	String name;
	private double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public User(int id, String name) { 
		this.id = id;
		this.name = name;
	}
	
	public User(int id, String name, double salary) { 
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
