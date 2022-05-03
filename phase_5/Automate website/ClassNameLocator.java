package seleniumScriptsDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
        
        driver.findElement(By.className("loginText mw-ui-input")).sendKeys("UserName");
        Thread.sleep(1500);
        
        driver.findElement(By.className("loginPassword mw-ui-input")).sendKeys("Password"); 
        Thread.sleep(1500);
        
        driver.findElement(By.className("mw-htmlform-submit mw-ui-button mw-ui-primary mw-ui-progressive")).click();
        Thread.sleep(1500);

	}

}
