package com.java;
import java.util.Scanner;
public class Factorial {

	public static int fact(int x) {
		int fact=1;
		for(int i=x;i>=1;i--) {
//			System.out.println(i);
			fact=fact*i;
		}
		return fact;
	}
	
	public static int fact1(int num) {
//		int x=num;
		if(num<=1) {
			return 1;
		}else {
			return num*fact(num-1);
		}
			
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num= scan.nextInt();
//		System.out.println(fact(num));
		System.out.println(fact1(num));
		scan.close();
	}
}
