package com.seventhWeek;

public class EqualMatrix {
	public static boolean matrixChecker(int arr1[][],int arr2[][]){
        int m1=arr1.length;
        int n1=arr1[0].length;
        int m2=arr2.length;
        int n2=arr2[0].length;
        if(m1!=m2 && n1!=n2){return false;}
        
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    
                    return false;
                }
            }
        }
        return true;
    }
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

        System.out.println(matrixChecker(arr,sqaureArr));
        
	}

}
