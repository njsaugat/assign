package com.fourthWeek;
public class BlockExample{
	public static int var = 10;// static variable
	public static int n;
	 
	// static block
	public static void hello(){// static method
	System.out.println("Static block initialized.");
	n = var* 8;
	}
	 
	public static void main(String[] args){
	BlockExample bloEx=new BlockExample();
	// using static methods:
	BlockExample.hello();// highly prefered.
	hello();// directly calling method
	bloEx.hello();// using a object to call, but this is less prefered.
	
	System.out.println("Value of var using class: "+BlockExample.var);
	System.out.println("Value of var directly printed: "+var);
	System.out.println("Value of var printed using object: "+bloEx.var);
	}}