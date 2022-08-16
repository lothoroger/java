package com.example.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	String name;
	String email;
	Order order; //1 to 1 order relationship maaping
	
	public User() {
		System.out.println("[User] - object  User() created");
	}
    
	//@Autowired
	public User(Order order) {
		System.out.println("[User] - Cosntructor User(Order order)  Injector - Parametrized object created");
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	//Setter method will inject order as dependency which is a reference type
	@Autowired
	public void setOrder(Order order) {
		System.out.println("[User] - Setter Injection - setOrder executed");
		this.order = order;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + "]";
	}


	

}
