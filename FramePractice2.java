package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

		// Switch to TOP frame
		driver.switchTo().frame("frame-bottom");

		System.out.println(driver.findElement(By.tagName("body")).getText());

		driver.quit();
	}
}