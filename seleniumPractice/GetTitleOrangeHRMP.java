package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitleOrangeHRMP
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
