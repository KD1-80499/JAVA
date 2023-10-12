package com.sunbeam.employees;

import java.util.Scanner;

public abstract class Employee
{
  private String firstname;
  private String lastname;
  private int SSN;
  
  abstract public void calculateSalary();
  
  public Employee(String firstname, String lastname, int SSN) 
  {

	this.firstname = firstname;
	this.lastname = lastname;
	this.SSN = SSN;
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

public int getSSN() {
	return SSN;
}

public void setSSN(int SSN) {
	this.SSN = SSN;
}

public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter firstname=");
	this.firstname=sc.next();
	System.out.println("Enter lastname=");
	this.lastname=sc.next();
	System.out.println("Enter SSN=");
	this.SSN=sc.nextInt();	
	
	
}

public void displayData()
{
	System.out.println("Enter firstname="+this.firstname);
	System.out.println("Enter lastname="+this.lastname);
	System.out.println("Enter SSN="+this.SSN);
}


@Override
public String toString() {
	return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", SSN=" + SSN + "]";
}


  
}
