package com.mphasis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class NestedTest {
	
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each of Demo5 (Outer class)");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each of Demo5(Outer class)");
	}
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All  of Demo5 (Outer class)");
	}
	
	@Nested
	class A {
		
		@BeforeEach
		void beforeEach() {
			System.out.println("Before Each of A");
		}
		
		@Test
		void testSampleMEthod() {
			System.out.println("Test executed from Nested inner class");
		}
		
		@AfterEach
		void afterEach() {
			System.out.println("After Each of A");
		}
	}

}
