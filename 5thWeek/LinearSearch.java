package com.fifthWeek;
import java.util.Scanner;
public class LinearSearch {
	public static void  linear() {
		int[] numArray=new int[10];
		Scanner scan=new Scanner(System.in);
		int num;
		for(int i=0;i<numArray.length;i++) {
			System.out.println("Enter a number");
			num=scan.nextInt();
			numArray[i]=num;
		}
		System.out.println("Enter a number that you want to check is present or not");
		int check=scan.nextInt();
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]==check) {
				System.out.println("the number is present");
				return ;
			}
		}
		System.out.println("the number is not present");
	}
	public static void main(String[] args) {
		LinearSearch.linear();
	}
}
