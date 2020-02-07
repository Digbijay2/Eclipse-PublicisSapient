package com.sapient.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		User user1 = new User(12, "Harish", 45000);
		User user2 = new User(23, "Vinay", 60000);
		User user3 = new User(67, "Ramesh", 25000);
		User user4 = new User(33, "Kiran", 10000);
		
		map.put(12, user1);
		map.put(11, user2);
		map.put(22, user3);
		map.put(34, user4);
		map.put(55, user1);
		map.put(92, user2);
//		System.out.println(map.size());
		
		
//		Set<Integer> keySet = map.keySet();					//for keys
//		
//		Iterator<Integer> it = keySet.iterator();
//		while(it.hasNext()) {
//			//System.out.println(map.get(it.next()));
//		}
//		
		
//		Collection<User> values = map.values();				//for values
//		
//		Iterator <User> userIt = values.iterator();
//		
//		while(userIt.hasNext()) {
//			System.out.println(userIt.next());
//		}
		
		
		Set<Map.Entry<Integer, User>> entrySet = map.entrySet();		//for keys and values both
																		//Map is an interface and Entry is an inner class
		Iterator<Map.Entry<Integer, User>> iterator = entrySet.iterator();		
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, User> entry = iterator.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}
}
