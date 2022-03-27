package com.assign;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the five digit number");
		int num=scan.nextInt();
		String numStg=String.valueOf(num);// nice way to convert number to String
		int num1=numStg.charAt(0)-'0';// this is ASCII value; so to change that we sub ascii of 0
		int num2=numStg.charAt(numStg.length()-2)-'0';// second last
		
		System.out.println((num1+num2)+"  is the required sum ");
		
		scan.close();
	}
}
