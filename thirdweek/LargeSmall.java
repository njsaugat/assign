package com.assign.thirdweek;
import java.util.Scanner;
public class LargeSmall {
	public static void main(String[] args) {
		int num;
		int min=32765;
		int max=-32765;
		boolean val=true;
		Scanner scan=new Scanner(System.in);
		while(val) {		
			System.out.println("Enter the number");
			num=scan.nextInt();	
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
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
	}}
