package com.fourthWeek;
import java.util.Scanner;
public class Input {
    // public static void display(int[] arr){
    //     for(int i=0;i<arr.length();i++){

    //     }
    // }
    public static void Main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] inputArray=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the number");
            int num1=scan.nextInt();
            inputArray[i]=num1;
        }
        for(int i=0;i<10;i++){
            System.out.println(inputArray[i]);
        }
        
    }
}
