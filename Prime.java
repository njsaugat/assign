package com.assign;
import java.util.Scanner;
public class Prime {
	
	public static void isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("The number is not prime");
				return;
			}
		}System.out.println("The number is prime");
		 
	}
	public static void isPrimeCount(int start, int end) {
		int count=0;
		for(int num=start;num<=end;num++) {
			int counter=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
//					System.out.println("The number is not prime");
					counter++;
					break;
				}
				
			}
			if(counter==0) {count++;}
			
		} 
		System.out.println("The number of primes are "+ count);
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the start value");
	int start=scan.nextInt();
	System.out.println("enter the end value");
	int end=scan.nextInt();
	isPrimeCount(start,end);
	scan.close();
	}
}
