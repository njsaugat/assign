package com.fourthWeek;

public class Swap {
	public static void swap(int val1,int val2) {
		int temp=val1;
		val1=val2;
		val2=temp;
		
	}
	public static void main(String[] args) {
		int num1=34;
		int num2=56;
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("1st number swapped "+ num1);
		System.out.println("2nd number swapped "+num2);
	}
}
