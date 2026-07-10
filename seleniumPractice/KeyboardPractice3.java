package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardPractice3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("tomsmith");
		
		username.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		username.sendKeys(Keys.chord(Keys.COMMAND, "c"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys(Keys.chord(Keys.COMMAND, "v"));
		
		System.out.println("COMMAND + executed succesfully.");
		System.out.println("Username was replaced with: admin");
		System.out.println("Password field contains: " + password.getAttribute("value"));
	}

}
