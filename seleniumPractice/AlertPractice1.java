package seleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertPractice1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        
        Alert alert = driver.switchTo().alert();
        
        String message = alert.getText();
        System.out.println(message);
        
        alert.accept();
    }
}