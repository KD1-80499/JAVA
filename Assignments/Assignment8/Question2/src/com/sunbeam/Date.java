package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	int day;
	int month;
	int year;
	Scanner sc=new Scanner(System.in);
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void accept() {
		System.out.println("Enter day:");
		this.day=sc.nextInt();
		System.out.println("Enter month:");
		this.month=sc.nextInt();
		System.out.println("Enter year:");
		this.year=sc.nextInt();
		
	}
	
	@Override
	public void display() 
	{
		System.out.println("Day:"+this.day);

		System.out.println("Month:"+this.month);

		System.out.println("Year"+this.year);

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

	
}
