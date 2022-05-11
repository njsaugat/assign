package com.IndividualProject;

public class Divisible {
	public static int isDivisible(int[] arr,int divisor) {
		if(arr.length==0) {return 1;}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor!=0) {
				return 0;
			}
		}return 1;
	}
	public static void main(String[] args) {
		int arr[]= {3,3,6,36};
		int divisor=3;
		System.out.println(isDivisible(arr,divisor));
		int arr1[]= {4};
		int divisor1=2;
		System.out.println(isDivisible(arr1,divisor1));
		int arr2[]= {3,4,3,6,36};
		int divisor2=3;
		System.out.println(isDivisible(arr2,divisor2));
		int arr3[]= {6,12,24,36};
		int divisor3=12;
		System.out.println(isDivisible(arr3,divisor3));
		int arr4[]= {};
		int divisor4=3432;
		System.out.println(isDivisible(arr4,divisor4));
	}
}	

