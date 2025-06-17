package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activty2 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/login-form/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(driver.getTitle());
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
	
	
//	find the sucess message
	String message = driver.findElement(By.tagName("h1")).getText();
	System.out.println(message.equals("Login Success!"));
	
	driver.quit();
}
}
