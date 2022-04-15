package com.fourthWeek;
public class LastQues {
	
	public static int getLengthString(String str)
    {
     int length=0;
     char[] strCharArray=str.toCharArray();
     for(int i=0;i<strCharArray.length;i++)
     {
      length++;
     }
     return length;
    }
	
    public static void main(String args[]){
        System.out.println("length of helloWorld string :"+getLengthString("refrigerator"));
        }
       
      
}
