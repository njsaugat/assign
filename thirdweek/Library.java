package com.assign.thirdweek;

public class Library {
	public static int totalFine(int days) {
		int day=days;
		int cost=0;
		if(days>=5||days<5) {
			cost+=day*2;
			day-=5;
		}
		if(days>=10 ||days<10) {
			cost+=day*3;
			day-=5;
		}
		if(days<=15) {
			cost+=day*4;
			day-=5;
		}
		if(days>15) {
			cost+=day*5;
		}
		return cost;
	}
	
	public static int totalFines(int days) {
		int day=days;
		int cost=0;
		if(day<=5) {
			cost+=day*2;//first 5 days ho bhane ta etti mai hunxa ;
		}else {
			cost+=5*2;// aba 6 days haru xa vane esma auxa; ani like first 5 days ko ta add garna paro ni
			day-=5;//aba yo garexi day lai pheri ghataune 
			if(day<=5) {
				cost+=day*3;
			}else {
				cost+=5*3;
				day-=5;
				if(day<=5) {
					cost+=day*4;
				}else {
					cost+=5*4;
					day-=5;
					cost+=day*5;
				}
			}
		}
		return cost;	
	}
	public static void main(String[] args) {
		System.out.println(totalFines(20));
	}
}
