package travelmanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import travelmanagement.TypeOfCab;

public class TypeofCabTest {
	
		TypeOfCab toc = new TypeOfCab();
		
		@Test
		void cabToPay() {
			
			assertEquals(765.0, toc.calculateFare("CrewCab", 15.0));
		}

		@Test
		void cabToPayTax() {
			
			assertEquals(994.50, toc.calculateFareWithTax("CrewCab", 15.0));
			assertEquals(1969.50, toc.calculateFareWithTax("TruckCab", 15.0));
		}
		
		@Test
		void cabToPayOtherType() {
			
			assertEquals(1658.25, toc.calculateFare("LimousineCab", 8.25));
		}
		
		@Test
		void cabToPayMin() {
			
			assertEquals(250, toc.calculateMinFare("LimousineCab"));
			assertEquals(20, toc.calculateMinFare("MiniCab"));
			assertEquals(50, toc.calculateMinFare("CrewCab"));
			assertEquals(80, toc.calculateMinFare("DoubleCab"));
			assertEquals(100, toc.calculateMinFare("TruckCab"));
			
		}
		
		
	}

