package com.assign.thirdweek;
import java.util.Scanner;
import java.util.Random;   
public class HighLow {
//	public static void valueGuesser(int userInput) {
//		int start=1;
//		int end=100;
//		int randomNumber=68;
//		int midGuess;
//		while(start<=end) {
//			midGuess=start+(end-start)/2;
//			if(randomNumber==userInput) {
//				System.out.println("Guess Successful");
//			}else if(userInput>randomNumber) {
//				end=midGuess;
//			}else {
//				start=midGuess;
//			}
//		}
//	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random = new Random();   
		int randomNumber=random.nextInt(100);;
		for(int i=0;i<10;i++) {
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
		System.out.print("the actual number was "+ randomNumber);
		scan.close();
		
		
	}
	
}
