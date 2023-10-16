package com.sunbeam;

import java.util.Scanner;

public class Commission_Employee extends Employee
{

	public Commission_Employee(String firstname, String lastname, int SSN,double grossSales,double comisionRate) 
	{
		super(firstname, lastname, SSN);
	}
	
	public Commission_Employee() {
		
	}

	protected double grossSales;
	protected double commissionRate;
	
	public double getGrossSales() 
	{
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public String toString() {
		return "Commission_Employee [grosssales=" + grossSales + ", commissionrate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}
	
	@Override
	public void acceptData()
	{
		super.acceptData();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter grossSales=");
	    this.grossSales=sc.nextDouble();
	    System.out.println("Enter commissionrate=");
	    this.commissionRate=sc.nextDouble();
	}
	
	@Override
	public void displayData() 
	{
		super.displayData();
	    System.out.println("GrossSales="+this.grossSales);
	    System.out.println("CommissionRate="+this.commissionRate);

	}
	@Override
	public double calculateSalary() 
	{
		return (this.commissionRate*this.grossSales);
		
	}
	
	
	

}
