package com.example.inheritancedemo.been;

public class Food {

	String name;
	int price;
	
	public Food() {
		System.out.println("[Food] - Object Created"+hashCode());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
