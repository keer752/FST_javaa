package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Avtivity8 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println(driver.getTitle());
		
		Actions builder = new Actions(driver);
//		find all the buttons
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetFile = driver.findElement(By.xpath("//h1[text()='target']"));
		
		
//		Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. Print the confirmation text at the end of the sequence.
		
		builder.click(cargoLock).pause(5000).click(cargoToml).build().perform();
//		print the confirmation text at the end f the sequence
		System.out.println(driver.findElement(By.id("result")).getText());
		
//		Double click on the src button. then click on the target button
		builder.doubleClick(srcFile).pause(5000). contextClick(targetFile).perform();
//		 select open.
	       builder.click(driver.findElement(By.cssSelector("span.ml-3"))).pause(5000).
	        build().perform();
		
//		 print the confirmation text at the end of the sequence.
		
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
	}
}