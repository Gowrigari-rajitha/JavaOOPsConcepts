package com.Encapsulation;

public class Customer {

	public static void main(String[] args) {
		Product p=new Product();
        p.setPrice(80);
        System.out.println("Price has changed by someone alert... "+p.getPrice());
        
	}

}
