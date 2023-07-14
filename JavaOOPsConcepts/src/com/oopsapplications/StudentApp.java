package com.oopsapplications;

public class StudentApp {

	public static void main(String[] args) {
		Studentapplication obj1=new Studentapplication(102,"rajji",520);
	    Studentapplication obj3=new Studentapplication(obj1);
        obj1.showStudent();
        obj3.showStudent();
	}

}
