package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement startButton = wait.until(
			ExpectedConditions.elementToBeClickable(By.cssSelector("#start button"))
		);
		
		startButton.click();
		
		System.out.println("Start button clicked successfully.");

		WebElement helloworld = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
		);
			
			System.out.println(helloworld.getText());
	}

}
