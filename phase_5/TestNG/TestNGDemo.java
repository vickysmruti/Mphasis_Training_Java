package testNGScripts;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(priority='1')
	public void login(){
		System.out.println("Login to the application");
	}
	
	@Test(priority='2')
	public void composeEmail(){
		System.out.println("Compose an Email");
	}

	@Test(priority='3')
	public void sendEmail(){
		System.out.println("Send an Email");
	}

	@Test(priority='4')
	public void logout(){
		System.out.println("Logout from the application");
	}

	
}
