package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice7 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement link = 
				driver.findElement(By.linkText("A/B Testing"));
		
		actions.keyDown(Keys.COMMAND)
			.click(link)
			.keyUp(Keys.COMMAND)
			.perform();
		
		System.out.println("Link opened in a new tab.");

	}

}
