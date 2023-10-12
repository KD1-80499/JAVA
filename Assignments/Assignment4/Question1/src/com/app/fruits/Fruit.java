package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	Scanner sc=new Scanner(System.in);
	
	public Fruit(String name, boolean isFresh)
	{
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste()
	{
		return "no specific taste";
		
	}
	
	public void acceptData()
	{
		
		System.out.println("Enter color");
		color=sc.next();
		System.out.println("Enter weight");
		weight=sc.nextDouble();	
	}
	
	public void displayData()
	{
		System.out.println("Colour="+this.color);
		System.out.println("Weight="+this.weight);
		System.out.println("Name="+this.name);
		System.out.println("Is Fresh"+this.isFresh);
	}
}		




	
	
    
	
	


