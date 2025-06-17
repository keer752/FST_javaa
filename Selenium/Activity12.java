package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://training-support.net/webelements/dynamic-content");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
//	Find and click the "Click me!" button.
	
	 driver.findElement(By.id("genButton")).click();
	
//	Wait till the word "release" appears.
	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
//	Get the text and print it to console.
	 System.out.println(driver.findElement(By.id("word")).getText());
//}
}
}
