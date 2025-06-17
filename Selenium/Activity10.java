package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/drag-drop");
	System.out.println(driver.getTitle());
	
	Actions builder = new Actions(driver);
	
//	Find the ball and simulate a click and drag to move it into "Dropzone 1".
	
	WebElement ball = driver.findElement(By.id("ball"));
	WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
	WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
	
	builder.dragAndDrop(ball,dropzone1).build().perform();
	
//	Verify that the ball has entered Dropzone 1.
	System.out.println(dropzone1.findElement(By.className("dropzone-text")).getText());
//	Once verified, move the ball into "Dropzone 2".
	builder.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();
//	Verify that the ball has entered Dropzone 2.
	System.out.println(dropzone2.getText());
	
	driver.quit();
}
}
