package com.abstraction;

public class Amazon extends product
{
	Amazon()
	{
		super("Nike");
	}

	@Override
	public void showproductprice() {
		System.out.println("product price range:$300 to $1000");
		
	}

	@Override
	public void showproductstock() {
		System.out.println("Less stock available..");
		
	}

}
