package com.sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee
{
	private double weeklySalary;
	
	
	
	public Salaried_Employee() {
		this.weeklySalary = 0;
	}

	public Salaried_Employee(String firstname, String lastname, int SSN)
	{
		super(firstname, lastname, SSN);
		this.weeklySalary=weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried_Employee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void acceptData() 
	{
		super.acceptData();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter WeeklySalary=");
		this.weeklySalary=sc.nextDouble();
	
	}
	@Override
	public void displayData() 
	{
		super.displayData();
		System.out.println("Weekly Salary="+this.weeklySalary);
	}

	@Override
	public double calculateSalary() 
	{
	  return this.weeklySalary;	
		
	}
	

	
	
}
