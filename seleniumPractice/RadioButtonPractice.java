package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/radio-button");

		Thread.sleep(2000);
		
		WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
				
		yesRadio.click();
	}

}
