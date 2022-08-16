package com.example.JUnit2;

import com.example.model.PromoCode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello JUnir5!" );
        PromoCode pRef = new PromoCode();
        System.out.println(pRef.getDiscount("JUMBO")); //0.40
        System.out.println(pRef.getAmountAfterDiscount("TRYNEW90",1000)); //950
        System.out.println(pRef.getDiscountOnAmountWithTaxes("SUNDAY", 1000)); // 880

      
    }
}
