package com.example.AOPdemo.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice  {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("[Before Advice]  executed "+method.getName());
	
		//1. validate stock
		System.out.println("[BeforeAdvice] - validate stock");
		Product prod = (Product) target;
		if(prod.getStock()<0) {
			prod.canbuy = false;
			System.out.println("[BeforeAdvice] - Out of stock "+prod.getName());
		} else {
			prod.canbuy=true;
			System.out.println("[BeforeAdvice] - Intiiating Transaction or amount of "+prod.price);
		}
	}

}
