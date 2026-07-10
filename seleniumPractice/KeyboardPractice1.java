package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardPractice1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("tomsmith");
		
		username.sendKeys(Keys.TAB);
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("SuperSecretPassword!");
		
		password.sendKeys(Keys.ENTER);
		
		System.out.println(driver.getTitle());
	}
	

}
