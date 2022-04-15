package com.fourthWeek;

public class This {
	//this() method
	public This(String name){
		this(20);
		System.out.println("Name of Student : " + name);
	}

	public This(int age){
		System.out.println("Age of student " + age);
	}
	public This(){
		this("Sumit");
	}
	public static void main(String[] args) {
		This obj=new This();// calls default constructor, then that calls one with String para which calls one with age
	}
}
