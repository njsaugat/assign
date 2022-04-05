package com.assign.thirdweek;
import java.util.Scanner;
public class LargeSmall {
	// public static void largeSmall() {
	// 	int num;
	// 	int min=32765;
	// 	int max=-32765;
	// 	boolean val=true;
	// 	while(val) {
	// 		Scanner scan=new Scanner(System.in);
	// 		System.out.println("Enter the number");
	// 		num=scan.nextInt();
	// 		System.out.println("Do you want to continue(Y/N)");
	// 		String value=scan.next().toLowerCase();
	// 		char valueyn=value.charAt(0);
	// 		System.out.println(num);
	// 		if(num>max) {
	// 			max=num;
	// 		}
	// 		if(num<min) {
	// 			min=num;
	// 		}
				
	// 		if(valueyn=='n') {val=false;}
	// 		scan.close();
	// 	}
	// 	System.out.println("the largest number is is "+ max);
	// 	System.out.println("the smallest numnber is "+ min);	
	// }
	public static void main(String[] args) {
//		largeSmall();
		int num;
		int min=32765;
		int max=-32765;
		boolean val=true;
		Scanner scan=new Scanner(System.in);
		while(val) {
			
			System.out.println("Enter the number");
			num=scan.nextInt();
			
			
			System.out.println(num);
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			System.out.print(min);
			System.out.print(max);
			System.out.println("Do you want to continue(Y/N)");
			String value=scan.next().toLowerCase();
			char valueyn=value.charAt(0);
			if(valueyn=='n'){
				val=false;
			}
			
		}
		scan.close();
		System.out.println("the largest number is is "+ max);
		System.out.println("the smallest numnber is "+ min);	
	
	}
}
