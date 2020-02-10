package com.sapient.calculator;

import java.util.Scanner;

public class MyCalculator {
	long power(int n, int p) throws NegativeException, ZeroException 
	{
		if( n<0 || p<0)
			throw  new NegativeException("n or p should not be negative");
		else if(n==0 && p==0)
			throw  new ZeroException("n and p should not be zero");
		else
			return (long) Math.pow(n, p);
			
	}
	
	public static void main(String[] args) throws NegativeException, ZeroException {
		
		MyCalculator myCalculator = new MyCalculator();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(myCalculator.power(a, b));
	}

}
