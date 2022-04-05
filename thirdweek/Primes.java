package com.assign.thirdweek;

public class Primes {
	public static void primes(int start, int end) {
		for(int num=start;num<end;num++) {
			int count=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				if(num!=1) {
					System.out.println(num);
				}
			}
		}
	}
	public static void main(String[] args) {
		primes(1,100);
	}
}
