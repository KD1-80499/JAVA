package com.sunbeam;

import java.util.Scanner;

public class Hourly_Employee extends Employee
{
	public Hourly_Employee()
	{
		
	}
	public Hourly_Employee(String firstname, String lastname, int SSN)
	{
		super(firstname, lastname, SSN);
	}
	
	private int hours;
	private double wages;
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	@Override
	public String toString() {
		return "Hourly_Employee [hours=" + hours + ", wages=" + wages + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void acceptData() 
	{
		super.acceptData();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hours Worked");
		this.hours=sc.nextInt();
		System.out.println("Enter Hourly wages");
		this.wages=sc.nextDouble();
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
	    System.out.println("Hours Worked="+this.hours);
	    System.out.println("Hourly Wages="+this.wages);
	}
	@Override
	public double calculateSalary() 
	{
		if(this.hours<=40)
		{
		  System.out.println("Regular Salary="+this.wages * this.hours);
		}
		else if(this.hours>40)
		{
		 System.out.println("OvertimeSalary="+((40*this.wages)+(this.hours-40)*this.wages*1.5));	
		 return ((40*this.wages)+(this.hours-40)*this.wages*1.5);
		}
//		System.out.println("Hourly Employee Salary="+(this.hours*this.wages)+(this.hours*(1.5*40*this.wages))));
		return ((40*this.wages)+(this.hours-40)*this.wages*1.5);
			
	};
		
	}



	


