package seleniumScriptsDay4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vicky@gmail.com");
		
//		driver.findElement(By.xpath("//input[@id='545passwd3242353534']")).sendKeys("passwd@123");
		
		//explicit wait	
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='passwd']"))));
		    
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("passwd@123");
		
		}
}
