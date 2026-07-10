package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTextPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/calendars/");

		Thread.sleep(2000);

		WebElement dateField = driver.findElement(
			    By.id("g1065-1-selectorenteradate"));

			dateField.sendKeys("2026-07-15");
		
	}

}
