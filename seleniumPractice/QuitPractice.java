package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		((JavascriptExecutor) driver).executeScript("window.open('https://www.youtube.com','_blank');");

	        // Open third tab
	    ((JavascriptExecutor) driver).executeScript("window.open('https://www.wikipedia.org','_blank');");

	    Thread.sleep(5000);

	    driver.quit();
	    }
	}
