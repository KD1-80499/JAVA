package com.sunbeam.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import com.sunbeam.Student;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student[] student=new Student[6];
		student[0]=new Student(35,"Swaroopa","Pune",99.9);
		student[1]=new Student(45,"Harshu","Pune",96.8);
		student[2]=new Student(10,"Sanket","Karad",96.8);
		student[3]=new Student(6,"Archita","Indiana",95.3);
		student[4]=new Student(5,"Vedu","sangli",80.4);
		student[5]=new Student(16,"Swaroopa","Bangalore",64.5);
		
		System.out.println("Before sort");
		for(Student ele:student)
			System.out.println(ele);

	    class CustomComparator implements Comparator<Student>
	    {
			@Override
			public int compare(Student s1, Student s2) 
			{
				int diff=-s1.getCity().compareTo(s2.getCity());
				if(diff==0)
					diff=-Double.compare(s1.getMarks(), s2.getMarks());
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
	    }
	    CustomComparator comparator=new CustomComparator();
	    System.out.println("After sort");
	    Arrays.sort(student,comparator);
	    for(Student ele:student)
	    	System.out.println(ele);
		

	}

}
