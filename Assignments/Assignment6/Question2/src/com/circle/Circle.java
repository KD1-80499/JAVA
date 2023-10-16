package com.circle;

import java.util.Scanner;

public class Circle 
{
 private double diameter;
 private Point2D point;
 
 Scanner sc=new Scanner(System.in);
 
 
public Circle() 
{
	this.diameter = 100;
	this.point = new Point2D(0,0);
}


public double getDiameter() {
	return diameter;
}


public void setDiameter(double diameter) {
	this.diameter = diameter;
}


public Point2D getPoint() {
	return point;
}


public void setPoint(Point2D point) {
	this.point = point;
}

public void acceptData() throws CircleDiaNonNegative
{
	System.out.println("Enter Diameter");
	this.diameter=sc.nextDouble();
	if(this.diameter<0)
{
	throw new CircleDiaNonNegative();
}	
   point.acceptData();
}



public void displayData()
{
	System.out.println("Circle Diameter="+this.diameter);
	point.displayData();
}

}

