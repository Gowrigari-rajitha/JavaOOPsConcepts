package com.interfacepackage;
import java.util.Scanner;
public class LaptopCustomer {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Lenovolaptop product1=new Lenovolaptop();
			Delllaptop product2=new Delllaptop();
			System.out.println("***Show LAPTOP***");
			System.out.println("Choose your brand");
			System.out.println("1.Lenovolaptop");
			System.out.println("2.Delllaptop");
			char choice=sc.next().charAt(0);
			switch(choice)
			{
			case 1:
				product1.viewproduct();
				product1.showModels();
				
			case 2:
				product2.viewproduct();
				product2.showModels();
			}
		}
		

	}

}
