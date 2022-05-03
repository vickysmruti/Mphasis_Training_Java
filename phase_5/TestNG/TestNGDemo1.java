package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	// @BeforeMethod  annotation : pre req method to be exeucted before every test method
	//@Aftermethod annotation: post req method to be exeucted after every test method

	WebDriver driver;
	
	@BeforeMethod
	public void startbrowser()
	{
       driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test(priority='1')  // test method
	public void testcase1() throws InterruptedException
	{
		driver.findElement(By.name("proceed")).click();
		
		 Thread.sleep(1000);
		
       Alert a = driver.switchTo().alert();
	
	   System.out.println( a.getText());
	 
	   a.accept();
	 
	   Thread.sleep(1000);
	 
	   driver.findElement(By.id("login1")).sendKeys("admin");
		 
	}
	
	
    @AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
