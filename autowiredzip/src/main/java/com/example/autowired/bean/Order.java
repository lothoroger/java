package com.example.autowired.bean;

public class Order {
	int orderId;
	String dateTimeStamp;
	int amount;
	
	
	public Order() {
		System.out.println("[Order] - object created");
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDateTimeStamp() {
		return dateTimeStamp;
	}
	public void setDateTimeStamp(String dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", dateTimeStamp=" + dateTimeStamp + ", amount=" + amount + "]";
	}

}
