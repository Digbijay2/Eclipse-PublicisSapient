package com.sapient.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date currentDate = new Date();
		
//		System.out.println(currentDate.getDate());
//		System.out.println(currentDate.getMonth());
//		System.out.println(currentDate.getDay());
//		System.out.println("Date >> " +currentDate); 
		
		//Printing the date in different format
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		
//		String todaysDate = dateFormat.format(currentDate);
//		System.out.println("Today's date "+ todaysDate);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		
		Date date = dateFormat.parse(str);
		System.out.println(date.getDay());
	}
}
