package com.assign.thirdweek;
import java.util.Scanner;
public class PrintSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num,sumEven=0,sumOdd=0;
		boolean val=true;
		while(val) {
			System.out.println("Enter the number");
			num=scan.nextInt();
			System.out.println("Do you want to continue(Y/N)");
			String value=scan.next().toLowerCase();
			char valueyn=value.charAt(0);
			if(num%2==0) {
				sumEven+=num;
			}else {
				sumOdd+=num;
			}		
			if(valueyn=='n') {val=false;}		
		}	
		System.out.println("the even sum is "+ sumEven);
		System.out.println("the odd sum is "+ sumOdd);
		scan.close();	
	}}
