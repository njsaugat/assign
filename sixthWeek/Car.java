package com.sixthWeek;
//import java.util.Scanner;


public class Car{
    public void runEngine(Engine e){
        e.getmodelnum();
        e.getBrand();
        e.getPrice();
    }
    public static void main(String[] args){
        Car mercedes=new Car();
        Engine veeEight=new Engine("SL450","MERCEDES",50000);
        mercedes.runEngine(veeEight);
    }
}