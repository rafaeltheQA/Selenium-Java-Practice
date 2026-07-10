package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[1]"));
		
		System.out.println("Before clicking: " +  checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("After click: " + checkbox.isSelected());

	}

}
