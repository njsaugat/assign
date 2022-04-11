package com.assign.thirdweek;

import java.util.Scanner;
public class Library {
	 public static int totalFines(int days) {
		 	int fine=0;
	        if (days <= 5) {
	            fine= 2*days;
	        } else if (days <= 10) {
	            fine= 2*5 + 3*(days - 5);
	        } else if (days <= 15) {
	            fine= 2*5 + 3*5 + 4*(days - 10);
	        } else {
	            fine= 2*5 + 3*5 + 4*5 + 5*(days - 15);
	        }
	        return fine;
	    }

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of days :");
		int days=scan.nextInt();
		System.out.println("Rs."+ totalFines(days)+" is the total fine to be paid.");
		scan.close();
	}
}
