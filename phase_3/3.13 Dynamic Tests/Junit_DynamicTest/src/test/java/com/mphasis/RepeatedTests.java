package com.mphasis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedTests {
	Calculator calculator;
	
	@BeforeEach
	void init() {
		calculator= new Calculator();
	}
	
	
	@Test
	@RepeatedTest(1000)
	void addNumber() {
		int actual = calculator.calculate(1, 3);
		Assertions.assertEquals(4, actual);
	}

}
