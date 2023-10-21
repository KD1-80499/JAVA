package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		List<Books> list = new ArrayList<>();
		Books b = new Books();

		int choice;
		int bookcnt = 0;

		do {

			System.out.println("0. Exit");
			System.out.println("1. Add new book in List " + "If book not present, then add a new book "
					+ "If book is present, increment its quantity");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete a book with given isbn");
			System.out.println("6. Reverse the list");
			System.out.println("7.Save books in file");
			System.out.println("8.Load books from file");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				Books book = new Books();
				book.accept();
				if (list.contains(book)) {
					int index = list.indexOf(book);
					book = list.get(index);
					book.setQuantity(book.getQuantity() + 1);
					System.out.println("cnt is incremented");
				} else {
					list.add(book);
					System.out.println("Book is added");
				}
				break;

			case 2:// Random Access

				ListIterator<Books> itr = list.listIterator();
				while (itr.hasNext()) {
					Books bk = itr.next();
					System.out.println(bk);
				}
				break;

			case 3:
				Books b1 = new Books();
				System.out.println("Enter isbn to be searched");
				String isbn = sc.next();
				b1.setIsbn(isbn);
				int index = list.indexOf(b1);
				if (index == -1) {
					System.out.println("Book not found");
				} else {
					System.out.println("Book found at index:" + index);
					book = list.get(index);
					System.out.println(book);
				}
				break;

			case 4:
				Books b2 = new Books();
				System.out.println("Enter index at which book to be deleted");
				String isbn1 = sc.next();
				b2.setIsbn(isbn1);
				int index1 = list.indexOf(b2);
				if (index1 >= 0 && index1 < list.size()) {
					list.remove(index1);
					System.out.println("Book removed");
				} else {
					System.out.println("Book not found");
				}
				break;

			case 5:
				Books b3 = new Books();
				System.out.println("Enter isbn to be deleted");
				String isbn2 = sc.next();
				b3.setIsbn(isbn2);
				if (list.remove(b3))
					System.out.println("Book removed");
				else
					System.out.println("Book not removed");
				break;

			case 6:
				Collections.reverse(list);
				System.out.println("Reversed List");

			case 7:
				try(FileOutputStream fout = new FileOutputStream("Books.bin")) {
					try(DataOutputStream dout = new DataOutputStream(fout)) {
						for(Books bk7 : list) {
							dout.writeUTF(bk7.getIsbn());
							dout.writeDouble(bk7.getPrice());
							dout.writeUTF(bk7.getAuthorName());
							dout.writeInt(bk7.getQuantity());
						}
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("Book saved.");
			
				break;

			case 8:
				try(FileInputStream fin = new FileInputStream("Books.bin")) {
					try(DataInputStream din = new DataInputStream(fin)) {
						while(true) {
							Books bk3 = new Books();
							bk3.setIsbn(din.readUTF());
							bk3.setPrice(din.readDouble());
							bk3.setAuthorName(din.readUTF());
							bk3.setQuantity(din.readInt());
							
							System.out.println(bk3);
						}
					} // din.close();
				} // fin.close();
				catch (EOFException e) {
					// do nothing
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				break;
			}

		} while (choice != 0);

	}

}
