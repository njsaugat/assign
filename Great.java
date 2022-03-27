package com.assign;
import java.util.Scanner;


public class Great {
	public  void maximum(int num1,int num2,int num3) {
		if(num1==num2 && num2==num3) {// Edge case when all the num are equal
			System.out.println("All of them are equal");
			
		}
		else if(num1>=num2 && num1>=num3) {
			System.out.println(num1+" is the greatest one");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println(num2+" is the greatest one");
		}else if(num3>=num1 && num3>=num1){
			System.out.println(num3+" is the greatest one");
		}
	}
	
	public void minimum(int num1,int num2,int num3) {
		if(num1==num2 && num2==num3) {// Edge case when all the num are equal
			System.out.println("All of them are equal");
		}
		else if(num1<=num2 && num1<=num3) {
			System.out.println(num1+" is the smallest one");
		}else if(num2<=num1 && num2<=num3) {
			System.out.println(num2+" is the smallest one");
		}else  if(num3<=num1 && num3<=num1){
			System.out.println(num3+" is the smallest one");
		}
	}
	
	public static void main(String[] args) {		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter your number :");
		int num1=scan.nextInt();
		System.out.print("enter your number :");
		int num2=scan.nextInt();
		System.out.print("enter your number :");
		int num3=scan.nextInt();
		
//		maximum(num1,num2,num3);//
		// if a method is defined as static then it can be directly used
		//inside the class becz the method being static belongs to class rather than obj
		
		Great obj=new Great();
		obj.maximum(num1, num2, num3);
		obj.minimum(num1, num2, num3);
		scan.close();
	}
	// if we use <= then edge case of 2numbers of being equal
	// will also be solved
}
