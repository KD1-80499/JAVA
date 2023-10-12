package com.sunbeam.dailycost;

import java.util.Scanner;

public class DailyDrivingCost {

	private double totalmiles;
	private double gasoline;
	private double avgmiles;
	private double parkingfees;
	private double tolls;
	private double cost;
	
	Scanner sc =new Scanner(System.in);
	
	
	public DailyDrivingCost()
	{
		this.totalmiles = 0;
		this.gasoline = 0;
		this.avgmiles = 0;
		this.parkingfees = 0;
		this.tolls = 0;
	}


	public DailyDrivingCost(double totalmiles, double gasoline, double avgmiles, double parkingfees, double tolls) 
	{
		this.totalmiles = totalmiles;
		this.gasoline = gasoline;
		this.avgmiles = avgmiles;
		this.parkingfees = parkingfees;
		this.tolls = tolls;
	}


	public double getTotalmiles() {
		return totalmiles;
	}


	public void setTotalmiles(double totalmiles) {
		this.totalmiles = totalmiles;
	}


	public double getGasoline() {
		return gasoline;
	}


	public void setGasoline(double gasoline) {
		this.gasoline = gasoline;
	}


	public double getAvgmiles() {
		return avgmiles;
	}


	public void setAvgmiles(double avgmiles) {
		this.avgmiles = avgmiles;
	}


	public double getParkingfees() {
		return parkingfees;
	}


	public void setParkingfees(double parkingfees) {
		this.parkingfees = parkingfees;
	}


	public double getTolls() {
		return tolls;
	}


	public void setTolls(double tolls) {
		this.tolls = tolls;
	}
	
	public void acceptData()
	{
		
		
		System.out.println("Enter Total miles driven per day:");
		this.totalmiles=sc.nextDouble();
		System.out.println("Enter Cost per gallon of gasoline");
		this.gasoline=sc.nextDouble();
		System.out.println("Average miles per gallon");
		this.avgmiles=sc.nextDouble();
		System.out.println("Parking fees per day");
		this.parkingfees=sc.nextDouble();
		System.out.println("Tolls per day");
		this.tolls=sc.nextDouble();
		
	}
	
	public void displayData()
	{
		System.out.println("Enter Total miles driven per day:"+this.totalmiles);
		System.out.println("Enter Cost per gallon of gasoline"+this.gasoline);
		System.out.println("Average miles per gallon"+this.avgmiles);
		System.out.println("Parking fees per day"+this.parkingfees);
		System.out.println("Tolls per day"+this.tolls);
		calculateCost();

	}
	
	public void calculateCost()
	{
	  this.cost=(((this.totalmiles/this.avgmiles)*this.gasoline)+this.parkingfees+this.tolls);
	  System.out.println("Cost Per Day"+this.cost);
	}
	
	

	
	
   
	
	

}
