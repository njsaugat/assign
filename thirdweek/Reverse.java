package com.assign.thirdweek;

import java.util.Scanner;

public class Reverse {
	
	public static int reverse(int num) {
		int reverse=0,remainder=0;
		while(num>0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number  :");
		int num=scan.nextInt();
		System.out.println(reverse(num)+" is the reverse number");
		scan.close();
	}
}
