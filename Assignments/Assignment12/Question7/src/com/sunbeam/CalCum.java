package com.sunbeam;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalCum {

	public static void main(String[] args)
	{
	 Random r=new Random();
	 
	 Stream<Integer>strm=Stream.generate(()->r.nextInt(10)).limit(10);
	 strm.toString();
	 int res=strm.reduce(0, (a,b)->a+b);
	 System.out.println(res);
 
	}
}
