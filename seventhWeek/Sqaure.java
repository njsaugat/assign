package com.seventhWeek;

public class Sqaure {
	public static void main(String[] args) {
        int arr[][]=new int[2][2];
        int sqaureArr[][]=new int[arr.length][arr[0].length];
        arr[0][0]=7;
        arr[0][1]=9;
        arr[1][0]=4;
        arr[1][1]=5;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sqaureArr[i][j]=arr[i][j]*arr[i][j];
            }
        }
        
        
        // for display
         for(int i=0;i<sqaureArr.length;i++){
            for(int j=0;j<sqaureArr[i].length;j++){
		        System.out.print(sqaureArr[i][j]+" ");
            }
	       System.out.println(" ");
            
        }

        
	}


}
