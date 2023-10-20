package com.sunbeam;

import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) 
	{
     int res;

	 Stream<Integer>strm=Stream.iterate(1, x->x+1).limit(10);
	 res=strm.reduce(1,(fact,i)->fact*i);
	 System.out.println(res);

	}

}
