package com.sunbeam;

import java.util.Scanner;

public class CountElements5 
{
	static <T> int countIf(T[] arr, T key, Check5<T> c)
	{
		int count=0;
		for(T t:arr)
		{ 
		  if(c.compare(t, key))
			  count ++;
		}	
		return count;
		
	}

	public static void main(String[] args) 
	{
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		Double[] arr1= {44.4,77.7,99.9,22.2,55.5,66.6,99.9,22.2};
		
		System.out.println("Check the key of repeatition");
		double key1=new Scanner(System.in).nextDouble();
		
		int cnt1=countIf(arr1,key1,(w,z)->w.equals(z));
		System.out.println("Count="+cnt1);

	}

}
