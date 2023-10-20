package com.sunbeam.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.sunbeam.BookDetails5;

public class BookTest5 {

	public static void main(String[] args) {
		Map<String,BookDetails5> map = new HashMap<>();
		int choice;

		do
		{	
		
		System.out.println("0.Exit");
		System.out.println("1.Insert in map and accept");
		System.out.println("2.Find in map");
		System.out.println("3.Display All values");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		
		switch(choice)
		  {
		case 0:System.out.println("Thank you");
		break;
		
		case 1:{
			BookDetails5 b=new BookDetails5();
			System.out.println("Insert in map");
			b.accept();
			map.put(b.getIsbn(), b);
			System.out.println("Book inserted");
		}
		break;
		
		case 2:
		{
			System.out.println("Enter isbn to be searched");
			String isbn = sc.next();
			BookDetails5 f = map.get(isbn);
			System.out.println(f);
		  }
		break;
		
		
		case 3: 
			Set<Entry<String,BookDetails5>>entries=map.entrySet();
			for(Entry<String,BookDetails5> entry:entries)
				System.out.println(entry.getKey()+""+entry.getValue());
			
		}
		}while(choice!=0);
	}
}
//No need to write equals() and hashCode() methods


