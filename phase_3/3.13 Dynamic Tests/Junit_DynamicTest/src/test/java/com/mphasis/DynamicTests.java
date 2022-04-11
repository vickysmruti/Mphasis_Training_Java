package com.mphasis;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class DynamicTests {

	@TestFactory
	Collection<DynamicTest> dynamicTest() {
		
		return Arrays.asList(
				DynamicTest.dynamicTest("Simple dynamic test", () -> {
					System.out.println("Test1 executed");
					Assertions.assertSame(2, 2);
					}
				),
				
				DynamicTest.dynamicTest("Simple dynamic test2", () -> {
					System.out.println("Test2 executed");
					Assertions.assertSame(2, 2);
					}
				)
				
				);
				
				
		
	}
}
