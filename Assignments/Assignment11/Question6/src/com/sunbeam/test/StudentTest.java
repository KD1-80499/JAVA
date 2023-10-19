package com.sunbeam.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.sunbeam.Student;

public class StudentTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Student> map = new LinkedHashMap<>();

		int choice;
		do {

			System.out.println("0.Exit");
			System.out.println("1.Insert and accept student in map ");
			System.out.println("2.Find rollno of student");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1: {
				Student s = new Student();
				System.out.println("Insert in map");
				s.accept();
				map.put(s.getRollno(), s);
				System.out.println("Student accepted");
			}
				break;

			case 2: {
				System.out.println("Enter rollno to be searched");
				int rollno = sc.nextInt();
				Student f = map.get(rollno);
				System.out.println(f);
			}
				break;
			}
		} while (choice != 0);
	}

}
