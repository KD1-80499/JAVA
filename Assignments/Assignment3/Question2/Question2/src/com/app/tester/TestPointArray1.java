package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of points to plot");
		Point2D[] points=new Point2D[sc.nextInt()];
		
		for(int i=0;i<points.length;i++)
		{
			points[i]=new Point2D();
		}
		for(int i=0;i<points.length;i++)
		{
			points[i].acceptData();
		}
		
		int choice;
		do
		{
			
		System.out.println("1. Display details of a specific point");
		System.out.println("2.Display x, y co-ordinates of all points");
		System.out.println("3.User i/p : 2 indices for the points , validate the indices");
		System.out.println("4.Exit");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: int c;
		         System.out.println("Enter index to view details of specific points");
		         c=sc.nextInt();
		         points[c].displayData();
		         break;
		         
		case 2:System.out.println("All points");
		            for(int i=0;i<points.length;i++)
		            {
		            	points[i].displayData();
		            }
		            break;
		            
		case 3: System.out.println("Enter 2 indexes to find distance between 2 points");
		       int a=sc.nextInt();
		       int b=sc.nextInt();
		       
		       if(a<points.length && b<points.length)
		       {
		    	  if(points[a].isequal(points[b]))
		    	  {
		    		  System.out.println("Both points are at same position");
		    	  }
		    	  else
		    	  {
		    		  points[a].calculateDistance(points[b]);
		    	  }
		          break;
		       }
		}

	}while(choice!=0);

}
}
