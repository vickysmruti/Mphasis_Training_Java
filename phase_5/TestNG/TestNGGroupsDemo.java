package testNGScripts;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	@Test(priority='1',groups="UnitTest")
	public void testCase1(){
		
		System.out.println("Test cases for Unit testing");
		
	}
	@Test(priority='2',groups = "UnitTest")
	public void testCase2(){
			
			System.out.println("Test cases for Unit testing");
			
		}
	@Test(priority='1',groups = "IntegrationTest")
	public void testCase3(){
		
		System.out.println("Test cases for Integration testing");
		
	}
	@Test(priority='2',groups = "IntegrationTest")
	public void testCase4(){
		
		System.out.println("Test cases for Integration testing");
		
	}
	@Test(priority='1',groups = "RegressionTest")
	public void testCase5(){
		
		System.out.println("Test cases for Regression testing");
		
	}
	@Test(priority='2',groups = "RegressionTest")
	public void testCase6(){
		
		System.out.println("Test cases for Regression testing");
		
	}

}
