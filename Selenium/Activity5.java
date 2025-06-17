package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
//		find the checkbox input element
	  WebElement checkBox = driver.findElement(By.id("checkbox"));
	  
//	  check if visible on the page
	  System.out.println(checkBox.isDisplayed());
	  
//	  click the remove checkbox button
	  driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
	  
//	  check if is visible again and print the result
	  System.out.println(checkBox.isDisplayed());
	  driver.quit();
	  
	}
}
