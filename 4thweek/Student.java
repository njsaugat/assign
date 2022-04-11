package com.fourthWeek;

public class Student {
    private String name;

    Student(){
        this.name="Unknown";
    }

    Student(String name){
        this.name=name;
    }

    public void getName(){
        System.out.println("The name is "+ this.name);
    }

    public static void main(String[] args){
        Student Sunil=new Student("Sunil Ghimire");
        Sunil.getName();

        Student Saijeet =new Student();
        Saijeet.getName();
    }
}
