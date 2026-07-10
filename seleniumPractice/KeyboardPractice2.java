package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardPractice2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("tomsmith");
		
		username.sendKeys(
				Keys.ARROW_LEFT,
				Keys.ARROW_LEFT,
				Keys.ARROW_LEFT,
				Keys.ARROW_LEFT
				);
		

		username.sendKeys(Keys.DELETE);
		
		System.out.println("DELETE key executed.");
		
	}

}
