package com.fifthWeek;

public class Rotate {
	public static int[] rotateRight(int[] arr) {
		int length=arr.length;
		int num=arr[length-1];// taking the last element;
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=num;
		return arr;
	}
	public static void main(String[] args) {
		int[] array= { 1, 2, 3, 4, 5};
		array=Rotate.rotateRight(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" , ");
		}
	}	
}
