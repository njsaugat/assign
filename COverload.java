package com.assign;

public class COverload {
	public void methodOverload(int n, char c) {
		System.out.println("The integer is "+ n);
		System.out.println("The character is "+c);
	}
	public void methodOverload(char c,int n) {
		System.out.println("The character is "+c);
		System.out.println("The integer is "+ n);
	}
	
	public static void main(String[] args) {
		COverload c1=new COverload();
		c1.methodOverload(1, 'S');
		c1.methodOverload('P', 2);
	}
}
