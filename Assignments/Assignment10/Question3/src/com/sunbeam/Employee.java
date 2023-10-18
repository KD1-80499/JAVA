package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {

private int empid;
private String firstname;
private String lastname;
private double monthlysalary;


public Employee() 
{
	this.firstname = "";
	this.lastname = "";
	this.monthlysalary = 0;
	this.empid=0;
}


public Employee(String firstname, String lastname, double monthlysalary) 
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.monthlysalary = monthlysalary;
	this.empid=empid;
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


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}

@Override
public int hashCode() {
	return Objects.hash(empid);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empid == other.empid;
}


@Override
public String toString() {
	return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", monthlysalary="
			+ monthlysalary + "]";
}


public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter empid=");
	empid=sc.nextInt();
	System.out.println("Enter FirstName:");
	firstname=sc.next();
	System.out.println("Enter LastName:");
	lastname=sc.next();
	System.out.println("Enter Monthlysalary:");
	monthlysalary=sc.nextDouble();
}
public void displayData()
{
	System.out.println("Empid="+empid);
	System.out.println("FirstName:"+firstname);
	System.out.println("LastName:"+lastname);
	System.out.println("Monthlysalary:"+monthlysalary);
	
}

}