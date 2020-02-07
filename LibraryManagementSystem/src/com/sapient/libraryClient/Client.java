package com.sapient.libraryClient;

import java.sql.SQLException;
import java.util.Scanner;

import com.sapient.libraryEmployee.Employee;
import com.sapient.libraryManager.Manager;

public class Client {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id :");
		int empid = sc.nextInt();
		
		Employee E = new Employee(empid);
		 
		Manager M = new Manager();
		
		int i=0;
		while(i==0) {
			System.out.println("choose any..");
			System.out.println("1. check book balance");
			System.out.println("2. update book balance");
			System.out.println("3. Exit");

			int ch = sc.nextInt();
			switch(ch)  {
			case 1: M.checkBookBalance(E);
					break;
					
			case 2: System.out.println("Enter how much book:");
			 		int book = sc.nextInt();
			 		M.updateBookBalance(E,book);
			 		break;
			 		
			case 3: i=1; System.exit(0);
			default: System.out.println("Enter any of these values");
				
			}
		}
		sc.close();
	}

}
