package com.assign;
import java.util.Scanner;
public class Bonus {

	public double netBonus(int years, double salary) {
		if(years>5) {
			return salary*(5d/100);// it's netBonus, not netSalary
		}
		return 0d;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your year of service");
		int years=scan.nextInt();
		System.out.println("Enter your salary");
		double salary=scan.nextDouble();
		
		Bonus ram=new Bonus();
		System.out.println(ram.netBonus(years,salary) +" is the net bonus");
		scan.close();
	}
}
