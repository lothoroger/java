package com.example.model;

import java.util.List;
import java.util.TreeMap;
import java.util.Arrays;

public class PromoCode {
	
	List<String> promoList;
	TreeMap<String, Double> promoCwithDiscounts;
	
	public PromoCode() {
		promoList = Arrays.asList("JUMBO", "BINGO", "HAPPY50", "TRYNEW90","SUNDAY");
		promoCwithDiscounts = new TreeMap<String, Double>();
		promoCwithDiscounts.put(promoList.get(0), 0.40);
		promoCwithDiscounts.put(promoList.get(1), 0.20);
		promoCwithDiscounts.put(promoList.get(2), 0.50);
		promoCwithDiscounts.put(promoList.get(3), 0.90);
		promoCwithDiscounts.put(promoList.get(4), 0.25);
		
	}
	public Double getDiscount(String promoC) {
		return promoCwithDiscounts.containsKey(promoC) ? promoCwithDiscounts.get(promoC) : 0.05;
	}
	
	public Double getAmountAfterDiscount(String promoC, double amount) {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return promoCwithDiscounts.containsKey(promoC) ? (amount - amount*promoCwithDiscounts.get(promoC)) : (amount - amount*0.05);
	}
	
	public Double getDiscountOnAmountWithTaxes(String promoC, double amount) {
		double amountAfterDiscount = getAmountAfterDiscount(promoC, amount);
		return (amountAfterDiscount + (0.18*amountAfterDiscount));
	}
	
	public boolean checkPromoCodes(String promoCs) {
		
		return promoList.contains(promoCs.toUpperCase());
	}
	
	public String luckyPromoCode(int luckyNumber) {
		return promoList.get(luckyNumber);
	}
	
}
