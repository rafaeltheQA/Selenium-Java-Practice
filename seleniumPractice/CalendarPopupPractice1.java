package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopupPractice1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/calendars/");
		
		Thread.sleep(2000);
		
		WebElement dateField = driver.findElement(By.id("g1065-1-selectorenteradate"));
		
		dateField.click();
		
		Thread.sleep(1000);
		
		for (int i = 1; i <= 5; i++)
		{
		
			WebElement nextMonth = driver.findElement(By.xpath("//button[text()='Next Month']"));
		
			nextMonth.click();
		
			Thread.sleep(1000);
		}
		
	
		WebElement day30 = driver.findElement(By.xpath("//button[text()='30']"));

		day30.click();
		
		System.out.println(dateField.getAttribute("value"));
	
		Thread.sleep(3000);
		
		driver.quit();
	}

}


	
