package com.sunbeam.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.test.*;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList();

		int choice;

		do {

			System.out.println("0. Exit");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Find Employee");
			System.out.println("4.Sort Employee");
			System.out.println("5.Edit Employee");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				Employee e = new Employee();
				e.acceptData();
				list.add(e);
				System.out.println("Employee added successfully");
				break;

			case 2:
				System.out.println("Enter index to remove the Employee");
				int index = sc.nextInt();
				list.remove(index);
				System.out.println("Employee removed");
				System.out.println("Size" + list.size());
				break;

			case 3:
				Employee e1 = new Employee();
				System.out.println("Employee at specific empid");
				int empid = sc.nextInt();
				e1.setEmpid(empid);
				int index1 = list.indexOf(e1);
				if (index1 == -1) {
					System.out.println("Employee not found");
				} else {
					System.out.println("Employee found at index:" + index1);
					e1 = list.get(index1);
					System.out.println(e1);
				}
				break;

			case 4:
				class EmployeeComparator implements Comparator<Employee> {

					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = Integer.compare(e1.getEmpid(), e2.getEmpid());
						return diff;
					}
				}
				EmployeeComparator comparator = new EmployeeComparator();
				list.sort(comparator);
				System.out.println(list);

				break;

			case 5:
				System.out.println("Enter emp id to be modified: ");
				int empid1 = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(empid1);
				int index2 = list.indexOf(key);
				if (index2 == -1)
					System.out.println("Employee not found");
				else {
					Employee oldEmp = list.get(index2);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.acceptData();
					list.set(index2, newEmp);
				}

			}

		} while (choice != 0);
	}
}
