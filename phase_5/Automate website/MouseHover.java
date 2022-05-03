package seleniumScriptsDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		//store the address of an element in an object of type WebElement
		
		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
				
		// we will make use of Actions class to perform the mouse hover activity
				

				
		Actions a = new Actions(driver);
				
		a.moveToElement(e1).perform();
				
				
				
		WebElement e2=	driver.findElement(By.xpath("//div[@id='nav-al-your-account']/descendant::span[5]"));
				
		WebDriverWait wait = new WebDriverWait(driver, 15);
			
		wait.until(ExpectedConditions.visibilityOf(e2));
			
		e2.click();
	}

}
