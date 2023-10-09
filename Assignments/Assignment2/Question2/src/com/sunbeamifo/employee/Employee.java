package com.sunbeamifo.employee;

import java.util.Scanner;

public class Employee {

private String firstname;
private String lastname;
private double monthlysalary;


public Employee() 
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.monthlysalary = monthlysalary;
}


public Employee(String firstname, String lastname, double monthlysalary) 
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.monthlysalary = monthlysalary;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public double getMonthlysalary() {
	return monthlysalary;
}


public void setMonthlysalary(double monthlysalary) {
	this.monthlysalary = monthlysalary;
}

public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter FirstName:");
	firstname=sc.next();
	System.out.println("Enter LastName:");
	lastname=sc.next();
	System.out.println("Enter Monthlysalary:");
	monthlysalary=sc.nextDouble();
}

}
