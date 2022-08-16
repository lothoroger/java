package com.example.dependencyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dependencyinjectiondemo.bean.Restaurant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Dependency Injection" );
        ApplicationContext cntxt = new ClassPathXmlApplicationContext("context.xml");
        Restaurant restrnt = cntxt.getBean("rRef", Restaurant.class);
          System.out.println(restrnt);
          System.out.println(restrnt.getAddrs());
          
          System.out.println("SEARCH KEYWORDS");
          System.out.println("Restaurants "+restrnt.getSearchKeywords());
    }
}
