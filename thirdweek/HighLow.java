package com.assign.thirdweek;
import java.util.Scanner;
import java.util.Random;   
public class HighLow {	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random = new Random();   
		int randomNumber=random.nextInt(100);
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Enter your guess");
			int guess=scan.nextInt();
			if(guess==randomNumber) {
				System.out.println("Correct guess");
				break;
			}else if(guess<randomNumber) {
				System.out.println("Higher");
			}else {
				System.out.println("Lower");
			}
		}
		System.out.println("the actual number was "+ randomNumber);
		System.out.println("Guessed in "+ i+ " turns");
		scan.close();	
	}}
