package com.fifthWeek;

public class Copy {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] copyArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copyArr[i]=arr[i];
		}
		
		
		// to display
		
		for(int i=0;i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
	}
}
