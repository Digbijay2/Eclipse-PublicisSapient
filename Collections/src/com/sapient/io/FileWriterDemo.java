package com.sapient.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\digpanda\\Desktop\\text.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file,true);
			fileWriter.append("Inserting to the file");
		} catch(FileNotFoundException e) {
			System.out.println("File is not present "+ file.getName());
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.out.printf("File Reader cannot be closed "+ e.getMessage());
			}
		}
	}
}
 