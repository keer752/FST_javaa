//Find the checkbox input element.
//Check if the checkbox is selected and print the result.
//Click the checkbox to select it.
//Check if the checkbox is selected again and print the result.

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
//	find the checkbox input element
		WebElement checkBox = driver.findElement(By.id("checkbox"));

		System.out.println(checkBox.isSelected());

		checkBox.click();

		System.out.println(checkBox.isSelected());
		driver.quit();

	}
}
