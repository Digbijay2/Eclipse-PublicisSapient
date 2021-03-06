package com.sapient.package1;

public class StringExamples {
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.contains("ello"));
		System.out.println(str.substring(1,3));
		
		StringBuffer sb = new StringBuffer(str);
		String res = sb.append("world").append("wow").toString();
		System.out.println(res);
		
		Integer i = 45;
		String str1 = "45";
		
		int intValue = Integer.parseInt(str1);
		int integerValue = i.intValue();
		System.out.println(integerValue);
		
		Integer obj = Integer.valueOf(integerValue);
		System.out.println(obj);
		System.out.println(i.MAX_VALUE);
		System.out.println(i.MIN_VALUE);
	}
}
