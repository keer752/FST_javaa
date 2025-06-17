package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity16 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/sliders/");
	Actions builder = new Actions(driver);
	System.out.println(driver.getTitle());
	
//	find the intial value
	
	WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
	System.out.println(volumeValue.getText());
	
//	find the slider
	WebElement slider = driver.findElement(By.id("volume"));
//	Move it to 25%
	builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120,0).release().build().perform();
	
//	print the new value
	System.out.println(volumeValue.getText());
//	Move to 75%
	builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120,0).release().build().perform();
//	print the new value
	System.out.println(volumeValue.getText());
}
}
