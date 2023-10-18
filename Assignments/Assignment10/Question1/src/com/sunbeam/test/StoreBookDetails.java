package com.sunbeam.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sunbeam.BookDetails;

public class StoreBookDetails {
	public static void main(String[] args) {

		List<BookDetails> list = new ArrayList<>();
		BookDetails b = new BookDetails();

		int choice;
		int bookcnt=0;

		do {

			System.out.println("0. Exit");
			System.out.println("1. Add new book in List "
					+ "If book not present, then add a new book "
					+ "If book is present, increment its quantity");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete a book with given isbn");
			System.out.println("6. Reverse the list");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				BookDetails book = new BookDetails();
				book.accept();
				if(list.contains(book))
				{
					int index=list.indexOf(book);
					book=list.get(index);
					book.setQuantity(book.getQuantity()+1);
					System.out.println("cnt is incremented");
				}
				else
				{
				list.add(book);
				System.out.println("Book is added");
				}
				break;
	
			case 2://Random Access 
				
			   ListIterator<BookDetails> itr=list.listIterator();
				while(itr.hasNext())
				{
				 BookDetails bk=itr.next();
				 System.out.println(bk);
				}
				break;

			case 3:
				BookDetails b1=new BookDetails();
		        System.out.println("Enter isbn to be searched");
		        String isbn=sc.next();
		        b1.setIsbn(isbn);
				int index =list.indexOf(b1);
				if(index==-1)
				{
					System.out.println("Book not found");
				}
				else
				{
					System.out.println("Book found at index:"+index);
					book=list.get(index);
					System.out.println(book);
				}
				break;
		

			case 4:
				BookDetails b2=new BookDetails();
				System.out.println("Enter index at which book to be deleted");
		        String isbn1=sc.next();
		        b2.setIsbn(isbn1);
				int index1 =list.indexOf(b2);
				if(index1>=0 && index1<list.size())
				{
					list.remove(index1);
					System.out.println("Book removed");
				}
				else
				{
				 System.out.println("Book not found");
				}
				break;

			case 5:
				BookDetails b3=new BookDetails();
				System.out.println("Enter isbn to be deleted");
		        String isbn2=sc.next();
		        b3.setIsbn(isbn2);
		        if(list.remove(b3))
		        	System.out.println("Book removed");
		        else
		        	System.out.println("Book not removed");
				break;
            
			case 6:
				Collections.reverse(list);
				System.out.println("Reversed List");
			}

		} while (choice != 0);

	}
}