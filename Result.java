package com.assign;

import java.util.Scanner;
public class Result {
	
	public int totalMarks(int x,int y,int z) {
		return x+y+z;
	}
	public double percent(int total) {
		double totalMarks=total;
		return (totalMarks/300)*100;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks ");
		int mark1=scan.nextInt();
		System.out.println("Enter the marks ");
		int mark2=scan.nextInt();
		System.out.println("Enter the marks ");
		int mark3=scan.nextInt();
		
		Result student=new Result();
		int marks= student.totalMarks(mark1, mark2, mark3);
		System.out.println(marks +" is the total marks ");
		System.out.println(student.percent(marks) +"% is the total percentage ");
//		int mark1=scan.nextInt();
		scan.close();
	}
	
}
