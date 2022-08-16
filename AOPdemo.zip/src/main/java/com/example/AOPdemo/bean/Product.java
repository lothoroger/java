package com.example.AOPdemo.bean;

public class Product {
		int id;
		String name;
		int price;
		String brand;
		int stock;
		boolean canbuy;
		
	public Product() {
		System.out.println("[Product] - object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isCanbuy() {
		return canbuy;
	}

	public void setCanbuy(boolean canbuy) {
		this.canbuy = canbuy;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ ", canbuy=" + canbuy + "]";
	}
	
	public void purchaseProduct(String deliveryloc, String deliveryTime, String userEmail) {
		//1. validate the Stock | Pre processing
		//System.out.println("[Product] validating stock on purchaseProduct() ");
		//if (stock > 0) {
		if (canbuy) {	
		//System.out.println("[Product] - Please intiate the transation for amoutn of  "+price);
			System.out.println();
			//2. Transaction - core business logic
			System.out.println("-------------------------------------------------------");
			System.out.println("[Product] Bank Transaction Sarted for "+name+" with price as "+price);
			System.out.println("[Product] Thank you  "+userEmail+" for buying "+name+" of "+brand);
			System.out.println();
			
		/*	//3. Notification | Post Processing
			System.out.println("[Product] Notifying "+userEmail+" through email with invoice of amount "+price);
			System.out.println("[Product] Product will be delivered at "+deliveryloc+" by "+deliveryTime);
			System.out.println("[Product] Notify the Shipment and Dispatch Department for the purchase of "+name);
		*/
		} else {
			System.out.println("[Product] out of Stock. Please come back later");
		}
	}
	
	
}
