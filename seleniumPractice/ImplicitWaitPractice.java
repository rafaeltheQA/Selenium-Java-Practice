package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// TODO Auto-generated method stub

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Implicit Wait is set for 5 seconds");
	}

}
