package com.example.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.autowired.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome Spring Framework [AUTOWIRED]" );
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("context.xml");
        
        User uRef = appCtx.getBean("aUser", User.class);
        System.out.println(uRef);
    }
}
