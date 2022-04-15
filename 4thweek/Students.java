package com.fourthWeek;
import java.io.*;
public class Students {
	private String name;
	private int age;
	//this keyword
	public Students(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println(this.name+" is the name");
		System.out.println(this.age +" is the age");
	}
	//this() method
	public Students(String name){
		this(20);
		System.out.println("Name of Student : " + name);
	}

	public Students(int age){
		System.out.println("Age of student " + age);
	}
	public Students(){
		this("Sumit");
	}
	public static void main(String[] args){
		
		Students student = new Students();// uses this() keyword
		Students student1 = new Students("Ram",20);// uses this in 1st constructor
	}}
