package com.sunbeam.employees;

public class Salarytest {

	public static void main(String[] args) {
//		Salaried_Employee se1=new Salaried_Employee("","",0);
//		se1.acceptData();
//		se1.displayData();
//		se1.calculateSalary();
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
		BasePlus_Commission_Employee bce1=new BasePlus_Commission_Employee("","",0,0,0);
		bce1.acceptData();
		bce1.displayData();
		bce1.calculateSalary();
		
	}

}
