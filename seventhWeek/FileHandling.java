package com.seventhWeek;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	public static void main(String[] args) {
		File file1=new File("file1.txt");
		try {
			file1.createNewFile();
			System.out.println("file created");
		}catch(IOException e) {
			System.out.println("Unable to create the file ");
			e.printStackTrace();
		}
//		
//		file1
		try {
			FileWriter fileWriter=new FileWriter("file1.txt");
			for(int i=0;i<5;i++) {
				fileWriter.write("I am learning file handling in java. \n");
				
			}
			fileWriter.close();
			System.out.println("Data added");
		}catch(IOException e) {
			System.out.println("Unable to write to  the file ");
			e.printStackTrace();
		}
		
		
	}
}
