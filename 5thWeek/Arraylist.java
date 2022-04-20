package com.fifthWeek;
import java.util.ArrayList;
public class Arraylist {// the name of the class should not be ArrayList
	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("guava");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("orange");
		System.out.println(fruits);
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("*******%%%");
		for(String i:fruits) {
			System.out.println(i);
		}
	}
}
