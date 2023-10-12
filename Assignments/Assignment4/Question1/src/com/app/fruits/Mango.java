package com.app.fruits;

public class Mango extends Fruit{

	public Mango()
	{
		super("Mango",true);
		
	}
	
	public String taste()
	{ 
		return "sweet";	
	}
	public void acceptData()
	{
		super.acceptData();
	}
    public void displayData()
    {
    	super.displayData();
    }
}
