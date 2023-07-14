package com.interfacepackage;

import com.abstraction.product;

public class Delllaptop extends product implements productInterface,productModels {
	Delllaptop()
	{
		super("Dell Laptop");
	}

	@Override
	public void addproduct() {
		System.out.println("new Lenovo Laptop added by owner");
		
	}

	@Override
	public void viewproduct() {
		System.out.println("new Lenovo models displayed by owner");
		
	}

	@Override
	public void updateproduct() {
		System.out.println("new Lenovo laptop prices and configuration updated by owner");
		
	}

	@Override
	public void deleteproduct() {
		System.out.println("old lenovo laptop models removed by owner");
		
	}

	@Override
	public void showModels() {
		System.out.println("All varient new models with high configuration available");
		
	}

	@Override
	public void showproductprice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showproductstock() {
		// TODO Auto-generated method stub
		
	}
	
	

}
