package com.sunbeam;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student other) {
		int diff = this.rollno - other.rollno;
		return diff;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno = sc.nextInt();
		System.out.println("Enter name=");
		name = sc.next();
		System.out.println("Enter city");
		city = sc.next();
		System.out.println("Enter marks");
		marks = sc.nextDouble();
	}

}