package com.app.geometry;

import java.util.Scanner;

public class Point2D
{
  private int x;
  private int y;
 
  
public Point2D() 
{
	this.x =0;
	this.y =0;
}

public Point2D(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public String tostring_x()
{
	String x_string=Integer.toString(x);
	return x_string;	
}
public String tostring_y()
{
	String y_string=Integer.toString(x);
	return y_string;	
}

public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter x-co-ordinate");
	this.x=sc.nextInt();
	System.out.println("Enter y-co-ordinate");
	this.y=sc.nextInt();
	
}

public void displayData()
{
	System.out.println("Enter x-co-ordinate"+this.x);
	System.out.println("Enter y-co-ordinate"+this.y);
}

public boolean isequal(Point2D p2)
{
	if(p2.x==this.x && this.y==p2.y)
	{
		return true;
	}
	else 
	return false;
	
}
public double calculateDistance(Point2D p2)
{
	double distance=Math.sqrt(Math.pow(p2.x-this.x,2)+(Math.pow(p2.y-this.y, 2)));
	return distance;
}

}
