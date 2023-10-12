package com.sunbeam.dailycosttest;

import com.sunbeam.dailycost.DailyDrivingCost;

public class DrivingCostTest {

	public static void main(String[] args) 
	{
		DailyDrivingCost drivingcost=new DailyDrivingCost();
		drivingcost.acceptData();
		drivingcost.calculateCost();
		drivingcost.displayData();	
	
	}

}
