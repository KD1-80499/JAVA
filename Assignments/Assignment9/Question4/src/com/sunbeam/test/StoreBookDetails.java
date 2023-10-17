package com.sunbeam.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.BookDetails;

public class StoreBookDetails {
	public static void main(String[] args) {

		List<BookDetails> list = new ArrayList<>();
		BookDetails b;

		int choice;

		do {

			System.out.println("0. Exit");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Delete at book given index -- list.remove(index)");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order"); // -- list.sort();
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				BookDetails book = new BookDetails();
				book.accept();
				list.add(book);
				break;

			case 2:
				for (BookDetails bk : list)
					System.out.println(bk);
				break;

			case 3:
				System.out.println("Enter index at which element to be deleted:");
				int index = sc.nextInt();
				list.remove(index);
				break;

			case 4:
				System.out.println("enter the isbn = ");
				String isbn = sc.next();
				BookDetails key = new BookDetails();
				key.setIsbn(isbn);
				if (list.contains(key))
					System.out.println("Found");
				else
					System.out.println("Not Found");
				break;

			case 5:
				list.clear();
				break;

			case 6:
				System.out.println("Size of list" + list.size());
				break;

			case 7:
				class BookPriceComparator implements Comparator<BookDetails> {
					public int compare(BookDetails b1, BookDetails b2) {
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}

				BookPriceComparator comparator = new BookPriceComparator();
				list.sort(comparator);
				break;
			}

		} while (choice != 0);

	}
}
