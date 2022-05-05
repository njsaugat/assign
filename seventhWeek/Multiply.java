package com.seventhWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) throws FileNotFoundException {
		File matrix=new File("matrix.txt");
		int[][] matr=new int[3][3];
		Scanner scan=new Scanner(matrix);
		int i=0;
		while(scan.hasNextLine()) {
			String value=scan.nextLine();
			String[] vals=value.split("\\s");
			int copy[]=new int[3];
				for(int j=0;j<3;j++) {
					copy[j]=Integer.parseInt(vals[j]);
				}

				matr[i++]=copy;
			}		
		
		for(int ind=0;ind<matr.length;ind++){
		    for(int j=0;j<matr[ind].length;j++){
		        System.out.print((5* matr[ind][j])+" ");
		    }
		   System.out.println(" ");
		    
		}
		scan.close();
}
}
