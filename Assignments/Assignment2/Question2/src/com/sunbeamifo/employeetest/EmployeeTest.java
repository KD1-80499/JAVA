package com.sunbeamifo.employeetest;

import com.sunbeamifo.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.acceptData();
		if(e1.getMonthlysalary()<=0)
		{
			e1.setMonthlysalary(0);
		}
		
		double yearly_salary=e1.getMonthlysalary()*12;
		System.out.println("Yearly Salary of Employee="+yearly_salary);
		
		double rised_yearly_salary=yearly_salary+(yearly_salary*0.1);
		System.out.println("Raised Salary="+rised_yearly_salary);

		Employee e2=new Employee();
		e1.acceptData();
		if(e1.getMonthlysalary()<=0)
		{
			e1.setMonthlysalary(0);
		}
		double yearly_salary1=e1.getMonthlysalary()*12;
		System.out.println("Yearly Salary of Employee="+yearly_salary);
		
		double rised_yearly_salary1=yearly_salary+(yearly_salary*0.1);
		System.out.println("Raised Salary="+rised_yearly_salary);
	}
}

