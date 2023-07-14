package com.polymorphism;
import java.util.Scanner;
class product
{
	public String showproduct(String brand,String pname)//method overloading can have different return type
	{
	  return brand+" "+pname;	
	}
	////method overloading can have same parameter length but it should be different data types
	public void showproduct(int pid,String pname,String pbrand)
	{
	  System.out.println("Product details 2: "+pid+" "+pname+" "+pbrand);	
	}
	public void showproduct(String pname,float price)
	{
	  System.out.println("Product details 3: "+pname+" "+price);	
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("1.View Pid and name");
    System.out.println("2.view pid,name and brand ");
    System.out.println("3.view name and price ");
    try (Scanner sc = new Scanner(System.in)) {
		product product=new product();
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			product.showproduct(sc.next(),sc.next());
			break;
		case 2:
			product.showproduct(sc.nextInt(),sc.next(),sc.next());
			break;
		case 3:
			product.showproduct(sc.next(),sc.nextFloat());
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}
    
    
    
    
	}

}
