package com.assign;
//import java.util.Scanner;
public class Tax {

	public double taxAmount(double income) {
		double net=0, netTax=0;
		if(income>250000) {
			net=income-250000;
			netTax=25000+((30d/100)*net);// this step took me so long to figure out
			//it's like the ques done in class; but like the division had to be double and not integer divion
			
			return netTax;
		}else if(income>150000) {
			net=income-150000;
			netTax=5000+(20d/100)*net;// no interger division
		}else if(income>100000) {
			net=income-100000;
			netTax=(10d/100)*net;// no integer division
		}
//		else {
//			return 0d;
//		}
		return 0d;
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the amount ");
//		double amount=scan.nextDouble();
		
		Tax person=new Tax();
//		System.out.println(person.taxAmount(amount) +" is the tax to be paid");
		System.out.println(person.taxAmount(99000.0) +" is the tax to be paid");
		System.out.println(person.taxAmount(300000.0) +" is the tax to be paid");
		System.out.println(person.taxAmount(800000.0) +" is the tax to be paid");
		System.out.println(person.taxAmount(2000000.0) +" is the tax to be paid");
		
//		scan.close();
	}
}
