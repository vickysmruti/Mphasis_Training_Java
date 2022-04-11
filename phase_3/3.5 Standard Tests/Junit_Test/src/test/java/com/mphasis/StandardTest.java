package com.mphasis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Demo1 Test")
public class StandardTest {

	@BeforeAll
	static void initAll() {
		System.out.println("Before All method executed..");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All method executed..");
	}

	@BeforeEach
	void beforeEachMEthod() {
		System.out.println("Before Each method executed..");
	}
	
	@AfterEach
	void afterEachMEthod() {
		System.out.println("After Each method executed..");
	}
	
	@Test
	@DisplayName("Success1 Test")
	void successTest() {
		System.out.println("Actual Test executed.");
	}
	
	@Test
	void successTest1() {
		System.out.println("Actual Test11 executed.");
	}
}