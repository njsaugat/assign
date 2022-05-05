package com.seventhWeek;

public class FindSum {
	public static void main(String[] args) {
        int arr1[][]={{4,5,6},{7,8,9},{2,3,4}};
        int arr2[][]={{10,11,12},{13,14,15},{16,17,18}};
        int arr3[][]=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
		      //  System.out.print(arr[i][j]+" ");
		        arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
//	       System.out.println(" ");
            
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
		        System.out.print(arr3[i][j]+" ");
            }
	       System.out.println(" ");
            
        }
        // System.out.println(sum);
        
	}


}
