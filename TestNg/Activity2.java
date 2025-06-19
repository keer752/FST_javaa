package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
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
		driver.get("https://training-support.net/webelements/target-practice/");
	}
	
	@Test(priority=1)
	public void verifyPageTitle(){
//		Assert the page title
		assertEquals(driver.getTitle(),"Selenium: Target Practice");
		
	}
	
	@Test(priority=2)
	public void verifyButtonText() {
		//find the button with text black
		String buttonText = driver.findElement(By.cssSelector("button.bg-slate-200")).getText();//actual:slate 
	    //assert the page title
		assertEquals(buttonText,"Black");
	
	}
	
	@Test(priority=3,enabled = false)
	public void  verifyHeadingText() {
		//find he heading with text heading #1
		String headingText = driver.findElement(By.tagName("h1")).getText();
		//assert the page title
		assertEquals(headingText,"Black");
	}
	
	@Test(priority=4)
	public void verifyFooterText() {
		throw new SkipException("this test will be skipped");
	}
	
	
	
	@AfterClass
	public void tearDown() {
		//close the browser
	
	driver.quit();
	}
	
	
	
}




