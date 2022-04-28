package com.sixthWeek;
public class BankAccount{
    private String name;
    private String address;
    private String accountType;
    private double balance;
    static int number=1000;
    private String accountNumber;
    
    BankAccount(String name, String address, String accountType,double balance){
        this.name=name;
        this.address=address;
        this.accountType=accountType;
        this.balance=balance;
        generateAccountNumber();

    }
    public void generateAccountNumber(){
        this.accountNumber="BA"+String.valueOf(number);
        number++;
    }
    public void displayInfo(){
        System.out.println("the name of the depositor is "+ this.name);
        System.out.println("the address of the depositor is "+ this.address);
        System.out.println("the acoount type of the depositor is "+ this.accountType);
        System.out.println("the balance of the depositor is "+ this.balance);
        System.out.println("the account number of the depositor is "+ this.accountNumber);
    }
    public void amountDeposit(double amount){
        this.balance+=amount;
        System.out.println("Rs. " +amount+ "deposited successfully" );

    }
    public void amountWithdraw(double amount){
        this.balance-=amount;
        System.out.println("Rs. "+amount+ "withdrawn successfully" );
    }
    public void changeAddress(String address){
        this.address=address;
        System.out.println( "Address changed successfully" );
    }
}