package com.example.JUnit2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.Test;

import com.example.model.PromoCode;

/*
import com.example.model.PromoCode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/*
public class AppTest 
    extends TestCase
{
	
	PromoCode  promoVar = new PromoCode();
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
 
	
    public AppTest( String testName )
    {
        super( testName );
        promoVar = new PromoCode();
    }

    /**
     * @return the suite of tests being tested
 
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)

    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testPromoCode() {
    	
    	assertEquals(true,promoVar.checkPromoCodes("bingo"));
    }
}
*/

public class AppTest {
	
	PromoCode prCs = new PromoCode();
	
/*
	
	@Test
	public void tetPromoCode()  {
		assertEquals(true, prCs.checkPromoCodes("HEELO"));
	}
	
	@Test
	public void tetDiscount() {
		String pCode = "jumbo";
		double expectedDisc = 0.40;
		assertEquals(expectedDisc, prCs.getDiscount(pCode)); }
	
	
	@Test
	public void tetAmtWithTaxDiscount() {
		String pCode = "HAPPY50";
		double amount = 1000;
	   
		double expectedDisc = 250.0;
		System.out.println("testAmtwithTaxDiscount"+pCode);
		assertEquals(expectedDisc, prCs.getDiscountOnAmountWithTaxes(pCode, amount));
	}
	
	@Test
	public void tetAmtAfterDiscount() {
		String pCode = "TRYNEW90";
		double amount = 1000.0;
		double expectedAmt= 150.0;
		assertEquals(expectedAmt, prCs.getAmountAfterDiscount(pCode,amount));
	}
	*/
	/*
	@Test
	public void basicTest() {
		assertEquals(0.40, prCs.getDiscount("JUMBO"));
	//	assertEquals(0.40, prCs.getDiscount("YEAR2022"), "Sorry Invalid Promo");
		
	}
	
	@Test
	public void groupTest() {
		assertAll("Promo Code Dioscount as 0.40", 
			()-> assertEquals(0.4, prCs.getDiscount("BINGO")),
			()-> assertEquals(0.9, prCs.getDiscount("TRYNEW90")),
			()-> assertEquals(0.4, prCs.getDiscount("HAPPY50"))
				);
	}
	
	@Test
	public void testLuckyNum() {
		Exception excp = assertThrows(ArrayIndexOutOfBoundsException.class,()->prCs.luckyPromoCode(7));
		System.out.println("Error on testLuck: "+excp.getMessage());
		assertEquals("Index 7 out of bounds for length 5", excp.getMessage());
	}
	
	
	@Test
	public void testTimeOut() {
		double amount = assertTimeout(ofMinutes(1), 	()->{ 
			return prCs.getAmountAfterDiscount("SUNDAY",1000);
					});
		assertEquals(750.0, amount);
		}
	*/
	
	
	
	
			
		@BeforeAll
		static void initAll() {
			System.out.println("[MyTestAnnotations] Before All - initAll");
		}
		@BeforeEach
		void init() {
			System.out.println("[MyTestAnnotations] Before Each - init");
		}
		
		@Test
		void myTest1() {
			
			System.out.println("[MyTestAnnotations] Test Case1  - myTest1");
			fail("TEst Case Failded");
		}

		@Test
		void myTest2() {
			
			System.out.println("[MyTestAnnotations] Test Case2  - myTest2");
			fail("Test case failed ");
		}

		@AfterEach
		void destroy() {
			System.out.println("[MyTestAnnotations] AFter each - destroy");
		}
		
		@AfterAll
		static void destroyAll() {
			System.out.println("[MyTestAnnotations] AFter Destory ALL - destroyAll");
		}
		
		@Test
		@Disabled
		void myTest3() {
			System.out.println("[MyTestAnnotations]  test case 3 - Disable");
		}

	}

