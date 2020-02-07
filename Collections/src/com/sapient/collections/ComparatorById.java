package com.sapient.collections;

import java.util.Comparator;

public class ComparatorById implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.id - o2.id;
	}



}
