package com.fourthWeek;

public class CharCheck {
	public static boolean isPresent(String str,char val) {
		char[] strArr=str.toCharArray();
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i]==val) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String word="umbrella";
		System.out.print("it is "+ isPresent(word,'e')+" that the char is present");
	}
}
