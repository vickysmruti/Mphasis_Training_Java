package seleniumScriptsDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		driver.findElement(By.id("wpPassword1")).sendKeys("admin");
		
		
	}
}
		