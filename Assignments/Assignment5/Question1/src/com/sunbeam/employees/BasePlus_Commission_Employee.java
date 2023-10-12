package com.sunbeam.employees;

import java.util.Scanner;

public class BasePlus_Commission_Employee extends Commission_Employee
{
	
	 public BasePlus_Commission_Employee(String firstname, String lastname, int SSN, double grossSales,
			double comisionRate) 
	 {
		super(firstname, lastname, SSN, grossSales, comisionRate);
	}

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlus_Commission_Employee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void acceptData()
	{
		super.acceptData();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter BaseSalary=");
	    this.baseSalary=sc.nextDouble();
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
	    System.out.println("BaseSalary="+this.baseSalary);
	}
	
	@Override
	public void calculateSalary() 
	{
	 System.out.println("Salary="+(((this.commissionRate*this.grossSales)+(this.baseSalary))+(this.commissionRate*this.grossSales)+(this.baseSalary)*0.1));	
		
	}
	
	

}
