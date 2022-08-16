package com.example.AOPdemo.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class AfterAdvice  implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println();
		
		if (method.getName().equals("purchaseProduct")) {
			System.out.println("[AfterAdvice] afterReturning executed "+method.getName());
			// 1. Validate the stock
			System.out.println("[AfterAdvice] - Notify in Action ...");
			Product prod = (Product) target;
		
			//3. Notification | Post Processing
			System.out.println("[AfterAdvice] Notifying "+args[2]+" through email with invoice of amount "+prod.price);
			System.out.println("[AfterAdvice] Product will be delivered at "+args[0]+" by "+args[1]);
			System.out.println("[AfterAdvice Notify the Shipment and Dispatch Department for the purchase of "+prod.name);
			}
		
		System.out.println();
		
	}

	
}
