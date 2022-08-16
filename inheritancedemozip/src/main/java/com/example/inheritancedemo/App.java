package com.example.inheritancedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.inheritancedemo.been.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome Inheritance Spring Core Configuration" );
        
        ApplicationContext appctx = new ClassPathXmlApplicationContext("context.xml");
        Pizza pRef = appctx.getBean("pizza", Pizza.class);
        System.out.println(pRef);
        
    }
}
