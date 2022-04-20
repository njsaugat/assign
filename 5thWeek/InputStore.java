package com.fifthWeek;
import java.util.ArrayList;
import java.util.Scanner;
public class InputStore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		ArrayList<Integer> storeArray=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number");
			num =scan.nextInt();
			storeArray.add(num);
		}
		for(int number:storeArray) {
			System.out.println(number);
		}
	}
}
