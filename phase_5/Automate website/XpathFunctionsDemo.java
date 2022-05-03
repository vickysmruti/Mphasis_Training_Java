package seleniumScriptsDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctionsDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		// radio button demo
		
		// relative xpath to select Opera radio button
		
		//syntax: //tagname[@attribute='value']
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
	  Thread.sleep(1500);
	  
	  // use the starts-with function and select Internet explorer radio button
	  
	  // synatx : //tagname[starts-with(@attribute,'starting value')]
	  
	  Thread.sleep(1500);
	  
	  driver.findElement(By.xpath("(//input[starts-with(@type,'radio')])[1]")).click();
	  
	  // use the contains function and select Mozilla radio button
		
		
		driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]")).click();
	

	}

}
