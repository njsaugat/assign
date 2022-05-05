package com.seventhWeek;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		try {
			File file1=new File("file1.txt");
			Scanner scan=new Scanner(file1);
			while(scan.hasNextLine()) {
				String line=scan.nextLine();
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Unable to create the file ");
			e.printStackTrace();
		}
	}
}
