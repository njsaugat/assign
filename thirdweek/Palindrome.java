package com.assign.thirdweek;

import java.util.Scanner;

public class Palindrome {
	public static void isPalindrome(int num) {
		int copyNum=num;
		int reverse=0,remainder=0;
		while(num>0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		if(copyNum==reverse) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("The number is not palindrome");
		}
//		return reverse;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number  :");
		int num=scan.nextInt();
		isPalindrome(num);
		scan.close();
	}
}
