package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mce_0_ifr");
		
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);
		

	}

}
