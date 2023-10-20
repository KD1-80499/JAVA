
package com.sunbeam;

public class EmpTest {

	public static void main(String[] args)
	{
	 Manager manager=new Manager(1000,200);
	 Labour labour=new Labour(10,2);
	 Clerk clerk=new Clerk(100);
	 
	 
	 Emp[] employee= {manager,labour,clerk};
	 double totalIncome=Emp.calcTotalIncome(employee);
	 System.out.println("TotalIncome of all Employees="+totalIncome);
	 }

	}
