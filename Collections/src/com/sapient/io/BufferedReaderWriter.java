package com.sapient.io;

import java.io.*;
public class BufferedReaderWriter {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\digpanda\\Desktop\\text.txt");
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println("File is not present "+ file.getName());
			e.printStackTrace();
		} 
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
//			String line = bufferedWriter.write();
//			while(line != null) {
//				System.out.println(line);
//				line = bufferedWriter.write();
			
			bufferedWriter.write("dcbdbcdkjbksbkjvbks v");
			
		} catch(FileNotFoundException e) {
			System.out.println("File is not present "+ file.getName());
			e.printStackTrace();
		} 
	}

}
 