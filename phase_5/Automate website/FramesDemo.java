package seleniumScriptsDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    
        // Switching between the frames
        
        driver.switchTo().frame("packageListFrame");
        
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("classFrame");
        
        driver.findElement(By.linkText("org.openqa.selenium.concurrent")).click();

	}

}
