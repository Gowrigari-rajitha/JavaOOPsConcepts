package com.oopsapplications;

public class Studentapplication {
   int sid;
   String sname;
   float marks;
   Studentapplication() //default constructor
   {
	 System.out.println("...Student App...");
   }
	
   Studentapplication(int sid,String sname,float marks) //constructor with parameters 
   {
	 this();
	 this.sid=sid;
	 this.sname=sname;
	 this.marks=marks;
   }
   
   //copy constructors(where your copying the data by using reference from one of the object to another object)
   Studentapplication(Studentapplication Studentapplication)
   {
	  this.sid=Studentapplication.sid;
	  this.sname=Studentapplication.sname;
	  this.marks=Studentapplication.marks;
	  
   }
	
   public void showStudent()
   {
	   System.out.println(sid+" "+sname+" "+marks);
   }
	
}
