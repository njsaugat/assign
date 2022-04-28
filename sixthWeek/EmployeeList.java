package com.sixthWeek;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeList{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        for(int i=1;i<6;i++){
            System.out.println("Enter the name of "+i+"th employee is :");
            String name=scan.next();
            System.out.println("Enter the salary of "+i+"th employee is:");
            double salary=scan.nextDouble();
            System.out.println("Enter the joining date of "+i+"th employee is:");
            String date=scan.next();
            System.out.println(" ");
            Employee emp=new Employee(name,salary,date);
            employeeList.add(emp);// for adding
        }

        for(Employee employee:employeeList){
            employee.getName();
            employee.getSalary();
            employee.getDate();
            System.out.println(" ");

        }
        scan.close();
    }
}