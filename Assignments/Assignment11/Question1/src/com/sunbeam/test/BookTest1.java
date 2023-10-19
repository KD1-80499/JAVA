package com.sunbeam.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

import com.sunbeam.BookDetails1;

public class BookTest1 {

	public static void main(String[] args) 
	{
		Set<BookDetails1> set=new HashSet<>();
		
		set.add(new BookDetails1("1",100,"A",10));
		set.add(new BookDetails1("5",500,"E",50));
		set.add(new BookDetails1("4",400,"D",40));
		set.add(new BookDetails1("2",200,"B",20));
		set.add(new BookDetails1("3",300,"C",30));
		set.add(new BookDetails1("6",600,"F",60));
		set.add(new BookDetails1("6",600,"F",60));
		
		Iterator<BookDetails1> itr=set.iterator();
		while(itr.hasNext())
		{
			BookDetails1 b=itr.next();
			System.out.println(b);
		}
//If any book with duplicate isbn is added then it will get added in the list as we haven't written any method of hashcode() and equals() and it is not ovverridden 
//Book are stored in random order		
	}

}
//Solve duplicate ISBN problem we will write two methods hashcode() and equals()
//For sorting we will use hashcode() method
//For removing dupicate values we will use equals() method