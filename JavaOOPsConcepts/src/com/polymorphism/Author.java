package com.polymorphism;

public class Author {
	String name;
	int age;
	String location;
	public Author(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getLocation() {
		return location;
	}

}
