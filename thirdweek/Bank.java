package com.assign.thirdweek;
public class Bank {
    String depositorName;
    double accountNumber;
    String accountType;
    double balanceAmount;
    Bank(String name, double number, String type, double balance ){
        this.depositorName=name;
        this.accountNumber=number;
        this.accountType=type;
        this.balanceAmount=balance;
        System.out.println(this.depositorName +" has deposited Rs." +this.balanceAmount+ " in "+this.accountNumber +" of type "+this.accountType);
    }   
    public  void balanceSetter(double amount){
        this.balanceAmount=amount;
    }   
    public void withdraw(double withdrawAmount){
        this.balanceAmount-=withdrawAmount;
    } 

    public void displayName(){
        System.out.println(this.depositorName);
        System.out.println(this.balanceAmount);
    }

    public static void main(String[] args){
        Bank person1=new Bank("Ramesh", 4534,"savings",32443);
        person1.displayName();
        person1.balanceSetter(4237879);
        person1.displayName();
        person1.withdraw(434534);
        person1.displayName();
        System.out.println("Hello\" World");        

    }
    
}
