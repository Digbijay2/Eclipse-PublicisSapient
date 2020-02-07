package com.sapient.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\digpanda\\Desktop\\text.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int character = 0;
			//character = fileReader.read();
			while(character != -1) {
				System.out.print((char)character);
				character = fileReader.read();
			}
		} catch(FileNotFoundException e) {
			System.out.println("File is not present "+ file.getName());
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.printf("File Reader cannot be closed "+ e.getMessage());
			}
		}
	}
}
 