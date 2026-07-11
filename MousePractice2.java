package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement doubleClickButton =
				driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		actions.doubleClick(doubleClickButton).perform();
		
		System.out.println("Double click performed sucessfully.");
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
