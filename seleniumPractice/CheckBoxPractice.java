package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		Thread.sleep(2000);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
		
		if (!checkbox1.isSelected()) {
			
			checkbox1.click();
			
		}
	}

}
