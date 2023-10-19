package com.sunbeam.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.BookDetails3;

public class BookTest3 {

	public static void main(String[] args) 
	{
		Set<BookDetails3> set=new TreeSet<>();
		
		set.add(new BookDetails3("1",100,"A",10));
		set.add(new BookDetails3("5",500,"E",50));
		set.add(new BookDetails3("4",400,"D",40));
		set.add(new BookDetails3("2",200,"B",20));
		set.add(new BookDetails3("3",300,"C",30));
		set.add(new BookDetails3("6",600,"F",60));
		set.add(new BookDetails3("6",600,"F",60));
		set.add(new BookDetails3("3",300,"C",30));
		
		Iterator<BookDetails3> itr=set.iterator();
		while(itr.hasNext())
		{
			BookDetails3 b=itr.next();
			System.out.println(b);
		}
//If any book with duplicate isbn is added then it will not get added in the list as we have implemented comparable method(natural order) in the class
//Book are stored as per the isbn code
	}

}
//hashcode() and equals() are not used in TreeSet<>
//It is already in the sorted order
//It does not contain any duplicate values