package com.fifthWeek;
import java.util.ArrayList;
public class Employee {
	private int id;
	private String name;
	private double salary;
	Employee(int id, String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public  void getId() {
		System.out.println("the id is "+ this.id);
	}
	public void getName() {
		System.out.println("the id is "+ this.name);
	}
	public void getSalary() {
		System.out.println("the id is "+ this.salary);
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void calculateTax() {
		double tax=salary*0.15;
		System.out.println("tax is  "+ tax);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(12,"Ram",40000);
		Employee e2=new Employee(312,"Hari", 50000);
		Employee e3=new Employee(322,"Shyam",43000);
		Employee e4=new Employee(67,"Ramesh",75500);
		Employee e5=new Employee(432,"Pramesh",35000);
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
//		System.out.println(employeeList);
		for(Employee emp:employeeList) {
			emp.getId();
			emp.getName();
			emp.getSalary();
			emp.calculateTax();
		}
	}
}
