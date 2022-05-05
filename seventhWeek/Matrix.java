package com.seventhWeek;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter a number");
				int num=scan.nextInt();
				matrix[i][j]=num;
			}
		}
		for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
		        System.out.print(matrix[i][j]+" ");
            }
	       System.out.println(" ");
            
        }
		
		try {
			File file1=new File("matrix.txt");
			file1.createNewFile();
			System.out.println("file created");
			
		}catch(IOException e) {
			System.out.println("Unable to create the file ");
			e.printStackTrace();
		}
		
		try {
			FileWriter fileWriter=new FileWriter("matrix.txt");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					fileWriter.write(Integer.toString(matrix[i][j])+" ");
				}
				fileWriter.write("\n");
			}
			fileWriter.close();
			
			
		}catch(IOException e) {
			System.out.println("Unable to write to  the file ");
			e.printStackTrace();
		}
	}
}
