package com.sixthWeek;
//import java.util.Scanner;

public class Engine{
    private String modelnum;
    private String brand;
    private double price;


    Engine(String modelnum,String brand, double price){
        this.modelnum=modelnum;
        this.brand=brand;
        this.price=price;
    }
    public void getmodelnum(){
        System.out.println("the model number is  "+ this.modelnum);
    }

    public void getBrand(){
        System.out.println("the brand  is "+this.brand);
    }

    public void getPrice(){
        System.out.println("the price is $"+ this.price);
    }
    public void setmodelnum(String modelnum){
        this.modelnum=modelnum;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setPrice(double price){
        this.price=price;
    }

}