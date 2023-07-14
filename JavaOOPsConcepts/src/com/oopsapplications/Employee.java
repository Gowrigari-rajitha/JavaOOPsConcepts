package com.oopsapplications;

import java.util.Scanner;


public class Employee {
	
	//instance variables or
	//instance data members
	int empid;
	String empname;
	float sal,bonus;
	static String company_name;
	Scanner sc = new Scanner(System.in);
	
	//instance methods
	public void addEmp()//method without return type
	{
		String empdept="IT";//local variables
		System.out.println("Enter Emp Id:");
		empid=sc.nextInt();
		System.out.println("Enter Emp Name:");
		empname=sc.next();
		System.out.println("Enter Emp sal:");
		sal=sc.nextFloat();
		System.out.println("Emp Depat: "+empdept);	
	}
	
	static
	{
		System.out.println("Execute this code first");
	}
	
	public static void showcompany()
	{
		
		System.out.println("Company name is: "+company_name);
	}
	
	//instance methods
	public void showEmp()
	{
		//System.out.println("Company name is: "+company_name);
		System.out.println("Emp Data is: "+empid+" "+empname+" "+sal);
	}
	
	//methods with return type
	public String showDept()
	{
		return "ITDept";
	}
	
	public float showSal()
	{
		return sal;
	}
	
	public int showId()
	{
		return empid;
	}

	public String showName()
	{
		return empname;
	}
	
	public void showbonus(char empgrade)
	{
		if(empgrade=='A')
		{
			bonus=5000;
		}
		else if(empgrade=='B')
		{
			bonus=4000;
		}
		else
		{
			bonus=3000;
		}
		System.out.println("Emp Bonus is: "+bonus);
	}
	
	
	public static void main(String[] args) {
		
     Employee e = new Employee(); //created an object called e
   /*  e.empid=101;
     e.empname="rajji";
     e.sal=5000;*/
     Employee.company_name="infosys";//static way :call the variable using class name,call the instance variable and instance methods using objects
     Employee.showcompany();
     e.addEmp();
     e.showEmp();
     e.showbonus('A');
     
     Employee e1 = new Employee(); //created an object called e
     /*  e1.empid=102;
     e1.empname="souji";
     e1.sal=4000;*/
     e1.addEmp();
     e1.showEmp();
     e1.showbonus('c');
	
    //  System.out.println("First Emp Data is: "+e.emid+" "+e.empname+" "+e.sal);
    // System.out.println("Second Emp Data is: "+e1.emid+" "+e1.empname+" "+e1.sal);
     
	}

}
