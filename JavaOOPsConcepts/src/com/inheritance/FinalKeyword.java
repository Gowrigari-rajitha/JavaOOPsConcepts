package com.inheritance;
class Vehicle
{
	 float price=6500;//if u add final it will give error
	public  float vehiclePrice()
	{
		price=7000;//can not over ride the variables
		return 7000;
	}
}
class Car extends Vehicle //can not override the class
{
	public final float vehiclePrice()//can not over ride the method from one class to another
	{
		return 7000;
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println("The Final Vehicle Price is: "+v.vehiclePrice());
		

	}

}
