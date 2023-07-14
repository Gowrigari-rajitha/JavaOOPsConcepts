package com.polymorphism;

public class Student {

	public static void main(String[] args) {
		Author a1=new Author("James Gosling",50,"USA");
		Book b1=new Book(001,"Complete Java Reference",200,12,a1);
		
		//call the methods
		b1.showBookDetails();
		b1.showAuthorDetails();

	}

}
