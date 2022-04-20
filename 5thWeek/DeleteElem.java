package com.fifthWeek;
import java.util.Scanner;
public class DeleteElem {
	public static int findIndex(int[] arr, int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}
	public static void display(int arr[],int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void shiftArray(int arr[], int deleteNum) {
		int index=findIndex(arr,deleteNum);
		if(index==-1) {
			System.out.println("number not in array");
			display(arr,arr.length);
		}else {
			for(int i=index;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			display(arr,arr.length-1);
		}
		
//		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number to delete");
		int deleteNum=scan.nextInt();
		shiftArray(arr, deleteNum);
		
		
		scan.close();
//		if(index==-1) {
//			System.out.println("Element not found");
//		}else {
//			
//		}
		
		
	}
}
