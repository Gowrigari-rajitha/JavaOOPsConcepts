package com.polymorphism;

public class Bank {
	public float showROI()
	{
		return 0f;
	}
}
  class BOA extends Bank
{
	public float showROI()
	{
		return 5.6f;
	}
}
 class ICICI extends Bank //It is a hierarchical inheritance
 {
	 public float showROI()
	 {
		 return 7.5f;
	 }
 }
class JPMC extends Bank
{

	@Override
	public float showROI() {
		// TODO Auto-generated method stub
		return 8.5f;
	}
	
}