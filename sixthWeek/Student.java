package com.sixthWeek;
import java.util.Scanner;
import java.util.ArrayList;
public class Student{
    private int id;
    private String name;
    private String email;
    private String address;
    Student(int id, String name,String email,String address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
    }
    public void getInfo(){
        System.out.println("the id of the student is "+ this.id);
        System.out.println("the name of the student is "+ this.name);
        System.out.println("the email of the student is "+ this.email);
        System.out.println("the address of the student is "+ this.address);
   
    }

    public static void main(String[] args){
        ArrayList<Student> studentList =new ArrayList<Student>();
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<5;i++){
            System.out.println("Enter the id of " +i +"th student");
            int id=scan.nextInt();
            System.out.println("Enter the name of " +i +"th student");
            String name=scan.next();
            System.out.println("Enter the email of " +i +"th student");
            String email=scan.next();
            System.out.println("Enter the address of " +i +"th student");
            String address=scan.next();
            System.out.println(" ");
            Student stud1=new Student(id,name,email,address);
            studentList.add(stud1);
        }
        int i=0;
        while(i<studentList.size()){
            studentList.get(i).getInfo();
            System.out.println(" ");
            i++;
        }
        scan.close();
    }
}