package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowPractice1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");

		driver.manage().window().maximize();
		
		String originalWindow = driver.getWindowHandle();
		
		System.out.println("Original Window: " + originalWindow);
		
		WebElement clickHere = driver.findElement(By.linkText("Click Here"));
		clickHere.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String handle : windowHandles) {
			
			if (!handle.equals(originalWindow))	{
				
				driver.switchTo().window(handle);
				
				break;
			}
		}
		System.out.println("New Window Title: " + driver.getTitle());

		driver.switchTo().window(originalWindow);

		System.out.println("Back to Original Window: " + driver.getTitle());
		
		
	}

}
