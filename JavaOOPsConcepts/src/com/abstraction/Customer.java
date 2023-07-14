package com.abstraction;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		//option where customer can choose type of service provide
		//example:option1 for amazon and option 2 for walmart 
		Walmart obj1=new Walmart();
		Amazon obj2=new Amazon();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("***Customer portal***");
			System.out.println("1.view Amazon product details");
			System.out.println("2.view Walmart product details");
			System.out.println("Enter your choice: ");
			int select_choice=sc.nextInt();
			switch(select_choice)
			{
			case 1:
				obj2.showproductlist();
				obj2.showproductprice();
				obj2.showproductstock();
				break;
				
			case 2:
				obj1.showproductlist();
				obj1.showproductprice();
				obj1.showproductstock();
				break;
				 default:
					 System.err.println("Invalid Choice..");
			}
		}
		
	}

}
