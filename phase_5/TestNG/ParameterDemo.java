package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	WebDriver driver;
	
	public void openBrowser()
    {
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
        
        
    }
	@Parameters({"username","password"})
	@Test(priority='1')
	public void login(String username, String password)
    {
        
        driver.findElement(By.id("wpName1")).sendKeys(username);
    
        driver.findElement(By.id("wpPassword1")).sendKeys(password);
    }
    @Parameters({"searchInput"})
	@Test(priority='2')
	public void method2(String searchInput)
	    {
	   
	        driver.navigate().to("https://www.google.com");
	        
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(searchInput);
	    }

	public void closebrowser()
	    {
	        driver.close();
	    }
	    
	}
