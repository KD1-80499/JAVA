package com.sunbeam.test;
//import  com.sunbeam;
import com.sunbeam.Employee;
import com.sunbeam.Commission_Employee;
import com.sunbeam.Hourly_Employee;
import com.sunbeam.Salaried_Employee;


class Emp<E extends Employee> 
{
	private E data;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	public double getTotalcaluculateSalary()
	{
		return data.calculateSalary();
	}
}

public class Salarytest
{
	public static void printAnyEmployee(Emp<? extends Employee>E)
	{
		
	}
	

	public static void main(String[] args) {
		
		Salaried_Employee se1=new Salaried_Employee();
		se1.acceptData();
		se1.displayData();
		
		Emp<Salaried_Employee> e1= new Emp<>();
		e1.setData(se1);
        System.out.println("Salaried Employee"+e1.getTotalcaluculateSalary());
	
		
        Hourly_Employee he1=new Hourly_Employee();
        he1.acceptData();
        he1.displayData();
        
		Emp<Hourly_Employee> e2= new Emp<>();
		e2.setData(he1);
		System.out.println("Hourly_Employee"+e2.getTotalcaluculateSalary());
		
		Commission_Employee ce1=new Commission_Employee();
		ce1.acceptData();
		ce1.displayData();
		
		Emp<Commission_Employee>e3=new Emp<>();
		e3.setData(ce1);
		System.out.println("Commission_Employee"+e3.getTotalcaluculateSalary());
		
		
	
		
		
	    
//		
//		
//		Hourly_Employee he1=new Hourly_Employee("","",0);
//		he1.acceptData();
//		he1.displayData();
//		he1.calculateSalary();
//		
//		Commission_Employee ce1=new Commission_Employee("","",0,0,0);
//		ce1.acceptData();
//		ce1.displayData();
//		ce1.calculateSalary();
//	
//		
		
	}	
	}

//printBox(Box<?> b)
//{
//	
//}
//
//
