package com.IndividualProject;

public class Vanila {
	public static int isVanila(int[] arr) {
		if(arr.length==0) {return 1;}
		int a=arr[0]%10;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {arr[i]=arr[i]*(-1);}
			while(arr[i]>0) {
				int val=arr[i]%10;
				if(val!=a) {
					return 0;
				}
				arr[i]=arr[i]/10;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		int a[]= {1};
		System.out.println(isVanila(a));
		int a1[]= {11, 22, 13, 34, 125};
		System.out.println(isVanila(a1));
		int a2[]= {9,999,99999,-9999};
		System.out.println(isVanila(a2));
		int a3[]= {};
		System.out.println(isVanila(a3));
	}
}
