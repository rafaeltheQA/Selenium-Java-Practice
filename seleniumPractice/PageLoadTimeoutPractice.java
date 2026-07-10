package seleniumPractice;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeoutPractice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("http://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		
		System.out.println("Page loaded successfully");
		
		driver.quit();
	}

}
