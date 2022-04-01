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
	
	public static int power(int x,int y) {
		int a=1;
		for(int i=1;i<=y;i++) {
			a=a*x;
		}
		return a;
	}
	
	public static int power1(int x, int y) {
		if(y==1) {
			return x;
		}
		else {
			return x*power1(x,y-1);
		}
	}
    public static void main(String[] args){
//    	int num=10;
//    	Scanner scan=new Scanner(System.in);
//    	System.out.println("enter the number");
//    	int num=scan.nextInt();
//    	table(num);
    	System.out.println(power1(5,3));
//    	scan.close();
        
//        System.out.println(sum);
    }
}
