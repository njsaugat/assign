package com.fifthWeek;

public class ArrayEqual {
	public static boolean checkEqual(int[] arr1,int[] arr2) {
		if(arr1.length !=arr2.length) {return false;}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] arr1= {1,2,3,4,5,6,7,9};
		System.out.print(checkEqual(arr,arr1));
	}
}
