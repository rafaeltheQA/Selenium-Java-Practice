package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenshotPractice2 {
	
	public static void testResult(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Screenshots/" + name + ".png");
		
		FileUtils.copyFile(source,  destination);
	}
	
	@Test
	public void loginTest() {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name"))
					.sendKeys("standard_user");
			
			driver.findElement(By.id("password"))
					.sendKeys("secret_sauce");
			
			driver.findElement(By.id("login-button"))
					.click();
			
			testResult(driver, "successful_login");
			
			Assert.assertTrue(
					driver.getCurrentUrl().contains("inventory")
			);
			
		} catch (Exception e) {
			
			try {
				testResult(driver, "login_failure");
			} catch (IOException screenshotError) {
				screenshotError.printStackTrace();
			}
			
			Assert.fail("Login test failed: " + e.getMessage());
			
		}	finally {
			
			driver.quit();
		}

	}

}
