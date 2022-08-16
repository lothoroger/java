package com.example.dependencyinjectiondemo.bean;

import java.util.List;

public class Restaurant {
	
	String name;
	String phone;
	String operatingHours;
	float ratings;
	//Reference type and will hodl the hascode for tsome Object
	Address addrs; // has a relationship 1 to 1
	List<String> searchKeywords; // has relationship 1 to many
	
	public List<String> getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(List<String> searchKeywords) {
		System.out.println("[Restaurant] - SET searchKeywords [1 to Many ]");
		this.searchKeywords = searchKeywords;
	}

	public Restaurant() {
			System.out.println("[Restaurant] - Object created/constructed");
	}
	
	//paraemtrized constructor fulfill the dependency address contructor injection.
	public Restaurant(Address addrs) {
		System.out.println("[Returaturan] Object const- parametrized");
		System.out.println("[Restaurant] constructor includection    [1 to 1]");
		this.addrs = addrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatinghours) {
		this.operatingHours = operatinghours;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Address getAddrs() {
		return addrs;
	}

	// Setter mehotd fulffuils the dependcy for the Adress
	public void setAddrs(Address addrs) {
		System.out.println("[Restaurant] SetAddress executed - setter injection ");
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatinghours=" + operatingHours + ", ratings="
				+ ratings + ", addrs=" + addrs + "]";
	}

	
}
