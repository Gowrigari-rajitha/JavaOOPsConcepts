package com.abstraction;

public class Walmart extends product
{
	Walmart()
    {
    	super("Adidas");
    }

	@Override
	public void showproductprice() {
		System.out.println("product price range:$500 to $2000");
		
	}

	@Override
	public void showproductstock() {
		System.out.println("product stocks are available..");
		
	}
	
 
	
	
	
}
