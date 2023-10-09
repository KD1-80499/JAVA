package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1=new Point2D();
		System.out.println("First point");
		p1.acceptData();
		
		Point2D p2=new Point2D();
		System.out.println("Second point");
		p2.acceptData();
		
		if(p1.isequal(p2))
		{
			System.out.println("Both points are equal");
			System.out.println("first point");
			p1.displayData();
			System.out.println("second point");
			p2.displayData();
		}
		else
		{
			System.out.println("Distance between 2 points ="+p1.calculateDistance(p2));
		}
	}

}
