package com.assign;

import java.util.Scanner;
public class Practise {
	public static void table(int num) {
		for(int i=1;i<=10;i++) {
        	int val=num;
        	val=i*num;
        	System.out.println(val);
        	
//        	sum+=i;
        }
	}
    public static void main(String[] args){
//    	int num=10;
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter the number");
    	int num=scan.nextInt();
    	table(num);
    	scan.close();
        
//        System.out.println(sum);
    }
}
