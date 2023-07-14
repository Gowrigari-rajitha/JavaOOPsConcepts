package com.polymorphism;

public class Book {
	int bid;
	String title;
	float price;
	int stock;
	Author author;//book is completely depends on author
 //this approach in java oops concept we called as title coupled programming language
	public Book(int bid, String title, float price, int stock, Author author) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
		this.stock = stock;
		this.author = author;
	}
	public void showBookDetails()
	{
		System.out.println("Book Data: "+bid+" "+title+" "+price+" "+stock);
	}
	public void showAuthorDetails()
	{
		System.out.println("Author Data: "+author.getName()+" "+author.getAge()+" "+author.getLocation());
	}
	
}
