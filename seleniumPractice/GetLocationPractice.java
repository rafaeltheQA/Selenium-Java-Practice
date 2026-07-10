package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationPractice  

{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		
		Point location = username.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X Coordinate: " + x);
		System.out.println("Y Coordinate: " + y);
		

	}

}
