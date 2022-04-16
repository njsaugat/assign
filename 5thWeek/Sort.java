package com.fifthWeek;

public class Sort {
	public int val;
//	public static void swap(Sort obj1, Sort obj2) {
//		int temp=obj1.val;
//		obj1.val=obj2.val;
//		obj2.val=temp;
//	}
	public static int[] bubbleSort(int arr[]) {
//		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
//					
				}
			}
		}
		return arr;
	}
	
	public static int[] bubbleSortDescend(int arr[]) {
//		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
//					
				}
			}
		}
		
		return arr;
	}
	public static void display(int[] numArr) {
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i] +" ");
		}
	}
	public static void main(String[] args) {
		int[] numArr= {8,9,2,3,7,4};
		numArr=bubbleSort(numArr);
		display(numArr);
		System.out.println(" ");
		numArr=bubbleSortDescend(numArr);
		display(numArr);
		
		
	}
}
