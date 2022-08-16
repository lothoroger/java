package com.example.inheritancedemo.been;

public class Pizza  extends Food {

	int size;
	String toppings;
	
	public Pizza() {
		System.out.println("[Pizza] - Object created "+hashCode());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", name=" + name + ", price=" + price + "]";
	}


	
}
