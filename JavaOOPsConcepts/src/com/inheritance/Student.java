package com.inheritance;
import java.util.Scanner;
//parent class or super class
public class Student {
	int sid;
	String name;
	char grade;
	String school_name;
	public void showstudent()
	{
		System.out.println(sid+" "+name+" "+grade+" "+school_name);
	}
	Student(String school_name)
	{
		this.school_name=school_name;
	}

}
//child class-1
class Teacher extends Student
{
	Teacher()//to refer super class constructor it must be inside subclass constructor
	{
		super("Oxford School");//constructor to constructor relationship
	}
	
	float mark1,mark2,mark3,total_marks;
	String sub1,sub2,sub3;
	Scanner sc=new Scanner(System.in);
	public void addsubject()
	{
		System.out.println("Enter sub1");
		sub1=sc.next();
		System.out.println("Enter sub2");
		sub2=sc.next();
		System.out.println("Enter sub3");
		sub3=sc.next();
		
	}
	public void addMarks()
	{
		System.out.println("Add "+sub1+" marks:");
		mark1=sc.nextFloat();
		System.out.println("Add "+sub2+" marks:");
		mark2=sc.nextFloat();
		System.out.println("Add "+sub3+" marks:");
		mark3=sc.nextFloat();
		total_marks=mark1+mark2+mark3;
		
	}
	public void showResult()
	{
		//super keyword is used to refer super class variables to sub class variables
		super.sid=101;
		super.name="rajji";//super class keyword must be use inside sub class method only
		super.grade='2';
		super.showstudent();//method to method relationship
		System.out.println("Total Marks is: "+total_marks);
	}
	
}
//child class(sub class)2
class principal extends Teacher
{
	char credit_score;
	public char showcredit_score()
	{
	    
		if(super.total_marks>=270)
		{
			credit_score = 'A';
			System.out.println("Credit_score is: "+credit_score);
		}
		else if(super.total_marks>=250) 
		{
			credit_score = 'B';
			System.out.println("Credit_score is: "+credit_score);
		}
		else 
		{
			credit_score ='C';
			System.out.println("Credit_score is: "+credit_score);
		}
		
		return credit_score;
	}
	
}





