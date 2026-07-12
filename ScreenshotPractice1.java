package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotPractice1 {
	
	public static void testResult(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(".//Screenshots/" + name + ".png");
		
		FileUtils.copyFile(source, destination);
	}
		
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://AutomationExercise.com/");
		
		testResult(driver, "AutomationExercise");
		
		driver.quit();

	}

}
