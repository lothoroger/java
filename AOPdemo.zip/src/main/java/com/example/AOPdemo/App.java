package com.example.AOPdemo;

import org.springframework.aop.framework.ProxyFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.AOPdemo.bean.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to AOP demo" );
        ApplicationContext appcontxt = new ClassPathXmlApplicationContext("context.xml");
        
        Product prod = appcontxt.getBean("prodProxy", Product.class);
     //   System.out.println(prod);
        
        prod.purchaseProduct("Albuquerque" , "6 PM Evening ", "john@example.com");
        
      //  ProxyFactoryBean - configure this class for our bean object with advices
        // 1. configure target 2. interceptorNames
        
        
        
    }
}
