package com.sapient.exceptions;

public class FinalDemo {
	public static void main(String[] args) {
		try {
			throwException(args[0]); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass the number as argument");
		} catch(NumberFormatException e) {
			System.out.println("input should be valid");
		} catch(IllegalArgumentException e) {
			System.out.println("Age should be greater than 18");
		} finally {
			System.out.println("Finally block");
		}
	}
	
	public static void throwException(String args) {
		int age = Integer.parseInt(args);
		if(age < 18) {
			 throw new IllegalArgumentException("invalid age for casting vote");
		}
	}
}
