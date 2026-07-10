package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
	}

}
