package seleniumScriptsDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetupCheck {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		String title1 = driver.getTitle();
		System.out.println("The Title of The Page 1 is : "+ title1);
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		String title2 = driver.getTitle();
		System.out.println("The Title of The Page 2 is : "+ title2);
		
		Thread.sleep(1500);
		
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println("The url of navigate back page is: "+ url);
		
		Thread.sleep(1500);
		
		driver.navigate().forward();
		String url1 = driver.getCurrentUrl();
		System.out.println("The url of navigate forward page is: "+ url1);
		
		driver.close();
		
	}

}
