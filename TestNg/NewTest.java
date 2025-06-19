package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
//	webDriver declaration
	WebDriver driver;
//	webDriverWait declaration
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
//		Intialize driver
		 driver = new FirefoxDriver();
//		Intialize wait
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
//		 open the page
		driver.get("https://training-support.net");
	}
	
	
	
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
//		Assert the page title
		assertEquals(driver.getTitle(),"Training Support");
		
	}
	
	@Test(priority=2)
	public void verifyaboutPage() {
		driver.findElement(By.linkText("About Us")).click();
//		wait till the page loads
		wait.until(ExpectedConditions.titleContains("About"));
//		Assert the page
		assertEquals(driver.getTitle(),"About Training Support");
	}
	
	
	@AfterClass
	public void tearDown() {
		//close the browser
	
	driver.quit();
	}
	
	

	
  
}
