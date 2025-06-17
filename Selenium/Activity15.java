package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		driver.manage().window().maximize();
//	Get the title of the page and print it to the console.

		System.out.println(driver.getTitle());

//	Find the input fields and type in the required data in the fields.
		driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]")).sendKeys("Some Name");
		driver.findElement(By.xpath("//input[contains(@id,'-email')]")).sendKeys("name@example.com");
		driver.findElement(By.xpath("//input[contains(@name,'-event-date')]")).sendKeys("2025-06-19");
		driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]")).sendKeys("Some random");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

//	Wait for success message to appear and print it to the console.
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-conformation")))
				.getText();
		System.out.println(message);
//	Close the browser.
		driver.quit();
	}
}
