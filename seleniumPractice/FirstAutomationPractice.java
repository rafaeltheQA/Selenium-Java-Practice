package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FirstAutomationPractice 
{
	@Test(enabled=true)
	public void register() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");

		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]")));
		
		dob_month.selectByContainsVisibleText("JUL");
		dob_month.selectByIndex(2);
		dob_month.selectByValue("03");
		dob_month.selectByVisibleText("JUNE");
		
		}

		@Test(enabled=true)
		public void login() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	
	

}
