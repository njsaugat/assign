package com.assign;

import java.util.Scanner;
public class ProductSum {
	
	public int product(int num1, int num2) {
		return num1*num2;
	}
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number ");
		int num1=scan.nextInt();
		System.out.print("Enter a number ");
		int num2=scan.nextInt();
		
		ProductSum obj=new ProductSum();
		System.out.println(obj.product(num1,num2)+" is the product");
		System.out.println(obj.sum(num1,num2)+" is the sum");
		
		scan.close();
	}
	
	
}
