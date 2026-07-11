package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice6 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("column-a"));
		
		WebElement target = driver.findElement(By.id("column-b"));
		
		actions.clickAndHold(source)
			.moveToElement(target)
			.release()
			.perform();

		System.out.println("Click and Hold performed successfully.");
	}

}
