package com.sunbeam.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.BookDetails4;

public class BookTest4 {

	public static void main(String[] args) {
		TreeSet<BookDetails4> set = new TreeSet<>();

		set.add(new BookDetails4("1", 100, "A", 10));
		set.add(new BookDetails4("5", 500, "E", 50));
		set.add(new BookDetails4("4", 400, "D", 40));
		set.add(new BookDetails4("2", 200, "B", 20));
		set.add(new BookDetails4("3", 300, "C", 30));
		set.add(new BookDetails4("6", 600, "F", 60));
		set.add(new BookDetails4("6", 600, "F", 60));
		set.add(new BookDetails4("3", 300, "C", 30));

		System.out.println("Ascending order:");
		Iterator<BookDetails4> itr = set.iterator();
		while (itr.hasNext()) {
			BookDetails4 b = itr.next();
			System.out.println(b);
		}

		System.out.println("Descending order:");
		Iterator<BookDetails4> itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			BookDetails4 e = itr1.next();
			System.out.print(e + ", ");
		}

		class BookPriceComparator implements Comparator<BookDetails4> {

			@Override
			public int compare(BookDetails4 d1, BookDetails4 d2) {
				int diff = -Double.compare(d1.getPrice(), d2.getPrice());
				return diff;
			}

		}

	}
}

