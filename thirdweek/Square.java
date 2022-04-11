package com.assign.thirdweek;

public class Square {
	public static int isSquares(int num) {
		int start=0;
		int end=num;
		int mid;
		while(start<=end){
			mid=start+(end-start)/2;
//			System.out.println(mid);
			if(mid*mid==num) {
//				return true;
				return 1;
			}else if(mid*mid>num) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
//		return start;
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(isSquares(17));
		System.out.println(isSquares(100));
	}
}
