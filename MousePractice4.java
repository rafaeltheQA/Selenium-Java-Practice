package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice4 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement firstImage =
				driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		actions.moveToElement(firstImage).perform();
		
		System.out.println("Mouse hovered over first image.");
	}

}
