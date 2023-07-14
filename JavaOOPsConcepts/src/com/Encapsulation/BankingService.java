 package com.Encapsulation;
import java.util.Scanner;
public class BankingService {

	public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
		BankingCustomer customer = new BankingCustomer();
		System.out.println("****Banking Menu****");
		System.out.println("Provide user credintials");
		System.out.println("User ID");
		customer.setUid(input.next());
		System.out.println("password");
		customer.setPwd(input.next());
   if(customer.getUid().equals("Rajitha")&customer.getPwd().equals("Rajitha@123"))
   {
		   System.out.println("Enter Your Account Type:");
		   customer.setAcc_type(input.next());
		   System.out.println("Enter your amount: ");
		   customer.setAmount(input.nextFloat());
		   if(customer.getAcc_type().equals("Savings")&customer.getAmount()<=1000)
		   {
			   System.out.println("Your transaction is successfully done..!!");
		   }
		   else if(customer.getAcc_type().equals("Current")&customer.getAmount()<=3000)
		   {
			   System.out.println("Your transaction is successfully done..!!");
		   }
		   else
		   {
			   System.err.println("oops your transaction limiy exceeds...!");
		   }
   }
   else
   {
		   System.err.println("Sorry invalid UID and PWD..");
   }
	}
	
}
}
