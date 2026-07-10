package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPageSourcePractice 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource.contains("user-name"));
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
