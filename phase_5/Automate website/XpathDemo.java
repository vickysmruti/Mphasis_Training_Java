package seleniumScriptsDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        
     // relative XPath example for checkbox
		
     		//input[@value='red']
     		//input[@value='green']
     		//input[@value='green']
     		
        // xpath using text() function ==? not applicable for this element
     		
        // xpath using starts-with() function
     		
     		// (//input[starts-with(@type,'check')])[1]
     		// (//input[starts-with(@type,'check')])[3]
     		// (//input[starts-with(@type,'check')])[5]
     		
      // xpath using contains() function
     		
     		//(//input[contains(@type,'box')])[1]
     		//(//input[contains(@type,'box')])[3]
     		//(//input[contains(@type,'box')])[5]
     		
     		
     		driver.findElement(By.xpath("//input[@value='red']")).click();
     		
     		Thread.sleep(1500);
     		
     		driver.findElement(By.xpath("(//input[starts-with(@type,'check')])[3]")).click();
     		
     		
     		Thread.sleep(1500);
     		
     		
     		driver.findElement(By.xpath("(//input[contains(@type,'box')])[5]")).click();
     		
     		
	}
        
}
