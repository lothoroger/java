package com.example.JUnit2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTestAnotation {
	
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
	}
	@Test
	void myTest2() {
		
		System.out.println("[MyTestAnnotations] Test Case2  - myTest2");
	}

	@AfterEach
	void destroy() {
		System.out.println("[MyTestAnnotations] AFter each - destroy");
	}
	
	@AfterAll
	void destroyAll() {
		System.out.println("[MyTestAnnotations] AFter Destory ALL - destroyAll");
	}
	
	
	}

