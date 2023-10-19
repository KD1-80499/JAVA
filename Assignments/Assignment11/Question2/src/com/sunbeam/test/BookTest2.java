package com.sunbeam.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

import com.sunbeam.BookDetails2;

public class BookTest2 {

	public static void main(String[] args) 
	{
		Set<BookDetails2> set=new LinkedHashSet<>();
		
		set.add(new BookDetails2("1",100,"A",10));
		set.add(new BookDetails2("5",500,"E",50));
		set.add(new BookDetails2("4",400,"D",40));
		set.add(new BookDetails2("2",200,"B",20));
		set.add(new BookDetails2("3",300,"C",30));
		set.add(new BookDetails2("6",600,"F",60));
		set.add(new BookDetails2("6",600,"F",60));
		
		Iterator<BookDetails2> itr=set.iterator();
		while(itr.hasNext())
		{
			BookDetails2 b=itr.next();
			System.out.println(b);
		}
//If any book with duplicate isbn is added then it will get added in the list as we haven't written any method of hashcode() and equals() and it is not ovverridden 
//Book are stored as per the order of insertion	
	}

}
//Solve duplicate ISBN problem we will write two methods hashcode() and equals()
//For sorting we will use hashcode() method
//For removing dupicate values we will use equals() method