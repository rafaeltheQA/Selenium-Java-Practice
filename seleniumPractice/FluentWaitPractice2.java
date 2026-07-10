package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitPractice2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2));
		
		driver.findElement(By.cssSelector("#start button")).click();
		
		WebElement helloWorld = wait.until(driver1 -> {
			
			WebElement element = driver1.findElement(By.id("finish"));
	
			if (element.isDisplayed()) {
				return element;
			}
			
			return null;
		});
		
			System.out.println(helloWorld.getText());
			
			driver.quit();
			
	}
	
}


