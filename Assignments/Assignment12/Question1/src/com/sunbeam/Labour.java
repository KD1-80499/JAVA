package com.sunbeam;

public class Labour implements Emp
{
	private int hours;
	private double rate;
	
	public Labour(int hours, double rate) 
	{
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double getSal() 
	{
		return this.rate*this.hours;

	}
	@Override
	public double calcIncentives()
	{
        if(this.hours>300)
        {
        	return 0.05*this.getSal();
        }
        else
        	
        return 0.0;
	}

}
