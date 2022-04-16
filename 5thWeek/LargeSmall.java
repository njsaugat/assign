package com.fifthWeek;

public class LargeSmall {
	public static void main(String[] args) {
		int[] numArray= {32,423,243423,243,6465,4655,65645,457,2,277};
		int min=32768;
		int max=-32768;
		int minIndex=0;
		int maxIndex=0;
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]>max) {
				max=numArray[i];
				maxIndex=i;
			}
			if(numArray[i]<min) {
				min=numArray[i];
				minIndex=i;
			}
		}
		System.out.println("the large number is "+ max+ " and its index is " + maxIndex);
		System.out.println("the small number is "+ min + " and its index is " + minIndex);
	}
}
