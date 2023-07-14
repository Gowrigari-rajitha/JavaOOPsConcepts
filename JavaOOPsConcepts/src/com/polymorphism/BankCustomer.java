package com.polymorphism;

public class BankCustomer {

	public static void main(String[] args) {
	
		Bank b1,b2,b3;
		b1=new BOA();
		b2=new ICICI();
		b3=new JPMC();
		System.out.println("BOA ROI is: "+b1.showROI());
		
		System.out.println("ICICI ROI is: "+b2.showROI());
		
		System.out.println("JPMC ROI is: "+b3.showROI());
		
		//dynamic method dispatching
		b3=b2;
		System.out.println("JPMC ROI is changed recently: "+b3.showROI());
		
	}
	

}
