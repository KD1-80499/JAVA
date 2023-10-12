package com.app.fruits;

public class Apple extends Fruit
{

	public Apple()
	{
		super("Apple",true);
	}

	public String taste()
	{
		return "sweet and sour";
	}
	public void acceptData()
	{
		super.acceptData();
	}
	public void displayData()
	{
		super.displayData();
	}
	
//	Apple()
//	{
//		super("Red",10,"Apple",true);
//	}

}
