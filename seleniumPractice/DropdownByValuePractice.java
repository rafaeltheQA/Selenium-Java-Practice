package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownByValuePractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select select = new Select(dropdown);
		
		select.selectByValue("1");
		
		Thread.sleep(2000);
		
		select.selectByValue("2");

	}

}
