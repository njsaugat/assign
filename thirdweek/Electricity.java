package com.assign.thirdweek;
import java.util.Scanner;
public class Electricity {
	public static int billGenerator(int units) {
		int unit=units;
		int cost=0;
		if(unit<100) {
			return 0;		
		}
		else {
			unit-=100;
		}
		if(unit>100) {
			unit-=100;
			if(unit<0) {
				cost+=unit*5;
			}
			else {
				cost+=unit*5;
			}
			
		}
		if(units>200) {
			cost+=unit*10;
		}
			
		return cost;
	}
	
	public static int billGenerators(int units) {
		int unit=units;
		int cost=0;
		if(unit<100) {
			return 0;		
		}
		else {
			unit-=100;
			if(unit<100) {
				cost+=unit*5;
			}
			else {
				cost+=100*5;
				unit-=100;
				cost+=unit*10;
				
			}
			
		}
		
			
		return cost;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of units :");
		int units=scan.nextInt();
		System.out.println(billGenerators(units) +" is the total bill");
		scan.close();
	}
}
