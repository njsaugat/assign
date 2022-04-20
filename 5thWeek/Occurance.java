package com.fifthWeek;

public class Occurance {
	public static void main(String[] args) {
		int[] arr= {10,20,30,10,10,20,40};
		boolean[] visited=new boolean[arr.length];
		String[] countArr=new String[10];
		int ind=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j] && visited[j]==false) {
					count++;
					visited[j]=true;
				}
			}
			if(count!=0) {
				countArr[ind]=Integer.toString(arr[i])+" occured "+Integer.toString(count)+" times";
				ind++;
			}
			
		}
		for(int i=0;i<countArr.length;i++) {
			if(countArr[i]!=null) {
				System.out.println(countArr[i]);
			}
			
		}
	}
}
