package com.fifthWeek;

public class Check {
	public static boolean checkArr(int arr[], int subArr[]) {
		for(int i=0;i<subArr.length;i++) {
			if(subArr[i]!=arr[i+3]) {
				return false;
			}
		}return true;

	}
	public static void main(String[] args) {
		int[] arr= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int[] subArr= {30, 25, 40, 32, 31, 35};
		if(checkArr(arr,subArr)) {
			System.out.print("the subarray lies in the array");
		}else {
			System.out.print("the subarray doesnot lie in the array");
		}
	}
}
