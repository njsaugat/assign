package com.fourthWeek;

public class Patterns {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {// first question
			for(int j=0;j<8;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<5;i++) {// second question
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		//3rd question:
		for(int i=1;i<=5;i++) {
			for(int space=5-i;space>=1;space--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// k+="*";	
			System.out.println(" ");
		}


		
		//4th question
		for(int i=1;i<=5;i++) {
			//for spaces:
			for(int space=5-i;space>=1;space--){
				System.out.print(" ");
			}
			//for central triangle
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for rightmost triangle

			for(int right=2;right<=i;right++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
			// for me the pattern questions are like breaking 
			// the structure into multiple components and 
			// tackling each one of them seperately
		// 5th question
		for(int i=1;i<=5;i++) {
			//for spaces:
			for(int space=5-i;space>=1;space--){
				System.out.print(" ");
			}
			//for central triangle
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			//for rightmost triangle

			for(int right=2;right<=i;right++){
				System.out.print(i);
			}
			System.out.println(" ");
		}


		//6th question
		for(int i=1;i<=5;i++) {
			//for spaces:
			for(int space=5-i;space>=1;space--){
				System.out.print(" ");
			}
			//for central triangle
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//for rightmost triangle

			for(int right=2;right<=i;right++){
				System.out.print(right);
			}
			// k+="*";	
			System.out.println(" ");
		}




		// for(int i=5;i>0;i--) {
		// 	for(int j=5;j>0;j--) {
		// 		if((i-j)>=1) {
		// 			System.out.print("*");
		// 		}else {
		// 			System.out.print(" ");
		// 		}
		// 	}
		// 	System.out.println(" ");
		// }
		// for(int i=1;i<6;i++) {
		// 	for(int j=1;j<6;j++) {
		// 		if(j>=i) {
		// 			System.out.print("*");
		// 		}else {
		// 			System.out.print(" ");
		// 		}
		// 	}
		// 	System.out.println(" ");
		// }
		
		
		
		// for(int i=5;i>0;i--) {// triangle pattern
		// 	for(int j=0;j<=5;j++) {
		// 		if(j>=i){
		// 			System.out.print("* ");
		// 			// System.out.print(" ");	
		// 		}else{
		// 			System.out.print(" ");
		// 		}
				
		// 	}
		// 	System.out.println(" ");
		// }




		
	}
}
