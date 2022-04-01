package com.assign;
import java.util.Scanner;
public class Discount {
	public static double netDiscount(int amount, char val) {// made this static to the class
		// since our return type is int; we have to return int
		// by using else condition any how
		if(amount<0) {
			return 0;
		}
		else if(amount>100000) {
//			longer method:
//			if(val=='l') {
//				return 10;
//			}else {return 15;}
//			shorter method using ternary operator:
			return (val=='l')?10:15;
		}else if(amount>57000) {
			return (val=='l')?7.5:10;
		}else if(amount>25000) {
			return (val=='l')?5:7.5;
		}else {
			return (val=='l')?0:5;
		}
	}
	
	public double netAmount(int amount,char val) {
		double discountRate=netDiscount(amount,val);
		double discount=(discountRate/100)*amount;
		double netAmount=amount-discount;
		
		return netAmount;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your name :");
		String name=scan.next();
		System.out.println("Enter your address :");
		String address=scan.next();
//		System.out.println(" ");
		System.out.print("Enter your purchase amount in Rs : ");
		int amount=scan.nextInt();
		System.out.print("Enter  L for laptop and D for desktop :");
		String s1=scan.next().toLowerCase();// char can't be converted to lowercase
		char val=s1.charAt(0);// first we made to lowercase then extracted
//		char val=scan.next().charAt(0);// we dont have a way to only take char as input;
		// so we are storing only 1st letter of string as char
//		val=val.lowercase();
		
		
		Discount shop=new Discount();
		System.out.println(name+ ",from "+ address +", is billed with Rs. " +shop.netAmount(amount,val) );
		
		scan.close();
	}
	
}
