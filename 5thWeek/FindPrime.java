package com.fifthWeek;

public class FindPrime {
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {10,12,17,19,25,85,96,56,11};
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i] +" - At index "+ i);
			}
		}
	}
}
