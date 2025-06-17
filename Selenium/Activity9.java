package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/keyboard-events");
	System.out.println(driver.getTitle());
	
	Actions builder = new Actions(driver);
	
//	On the page, type out a string from the Selenium script to show on the page
	
	builder.sendKeys("this is some text with 123 and !!@#$").build().perform();
	
//	Print the message to the console.
	
	System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
	
	
//	Close the browser.
	
	
	driver.quit();
}
}
