package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		System.out.println("Actions object created successfully.");
		
		WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
		
		actions.click(abTesting).perform();
		
		System.out.println("A/B Testing link clicked sucessfully.");

	}

}
