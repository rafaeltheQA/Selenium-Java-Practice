package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practicetestautomation.com/practice-test-login/");
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	}

}
