package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepPractice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Waiting...");
		
		Thread.sleep(5000);
		
		System.out.println("Done waiting!");

	}

}
