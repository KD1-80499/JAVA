package com.sunbeam;

public class Manager implements Emp
{
	private double basicSalary;
	private double dearanceAllowance;
	  
	public Manager(double basicSalary, double dearanceAllowance)
	{
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public double getDearanceAllowance() {
		return dearanceAllowance;
	}



	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}



	@Override
	public double getSal() 
	{
		return this.basicSalary+this.dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() 
	{
//		(20/100)*this.basicSalary;
//		return Emp.super.calcIncentives();
		
		return basicSalary*0.2;
	}

}
