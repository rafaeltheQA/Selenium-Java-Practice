package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPractice {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.wikipedia.org");
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	}

}
