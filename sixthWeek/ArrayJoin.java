package com.sixthWeek;
//import java.util.Scanner;

public class ArrayJoin{
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverse(int[] arr){
        // int[] reverse=new int[arr.length];
        // for(int i=0;)
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static int[] joinArray(int[] A, int[] B){
        B=reverse(B);// now both are in asscending order
        int m=A.length;
        int n=B.length;
        int[] C=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }else{
                C[k++]=B[j++];
            }
        }
        for(;i<m;i++){
            C[k++]=A[i];
        }
        for(;j<n;j++){
            C[k++]=B[j];
        }
        
        return C;
    }
    public static void main(String[] args){
        int[] A={2,4,6,8,10,12,14,16,18};
        int[] B={19,17,15,13,11,9,7,5,3,1};
        // int[] C={};
        int[] C=joinArray(A,B);
        display(C);
        
    }
}