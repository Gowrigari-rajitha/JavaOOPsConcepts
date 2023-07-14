package com.abstraction;

public abstract class product {
	String product_brand;
	String product[]= {"Laptop","AC","Tv"};
	//normal method
	public void showproductlist()
	{
		for(String product:product)
		{
			System.out.println(product);
		}
		System.out.println("Product_brand: "+product_brand);
	}
    //abstract method without body
	public abstract void showproductprice();
	public abstract void showproductstock();
	//constructor
	public product(String product_brand) 
	{
		this.product_brand = product_brand;
	}
	
}
