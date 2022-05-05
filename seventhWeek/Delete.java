package com.seventhWeek;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		try {
			File file1=new File("file1.txt");
			if(file1.delete()) {
				System.out.println("File deleted");
			}else {
				System.out.println("File deleted failed");
			}
		}
		catch(Exception e){  
			e.printStackTrace();  
		} 
		
	}
		
}
