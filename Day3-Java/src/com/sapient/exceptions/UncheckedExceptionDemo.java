package com.sapient.exceptions;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		int[] array = {34,45,43,21};
		try {
		System.out.println("The value is "+ Integer.parseInt("sdfc"));		//Numberformat Exceptions
		System.out.println("The fifth element of the array is "+array[5]);	//ArrayIndexOutOfBound Exceptions
		array = null;
		System.out.println("The fifth element of the array is "+array[1]);	//NullPointer Exceptions
		
		} catch(NumberFormatException exception) {
			System.out.println("Please enter a valid number");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please select the number between array");
		} catch(NullPointerException e) {
			System.out.println("Cannot access null object");
		}/* catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
		System.out.println("invalid input"+ e.getMessage());
		}*/
		catch(Exception e) {
			System.out.println("Generic exception");
			System.out.println(e instanceof NumberFormatException);
			System.out.println(e instanceof ArrayIndexOutOfBoundsException);
		}
	}
} 

