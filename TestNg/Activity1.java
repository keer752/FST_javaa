package Activities;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity1 {
	

	
	
//		webDriver declaration
		WebDriver driver;
//		webDriverWait declaration
		WebDriverWait wait;
		
		@BeforeClass
		public void setup() {
//			Intialize driver
			 driver = new FirefoxDriver();
//			Intialize wait
			 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			 
//			 open the page
			driver.get("https://training-support.net");
		}
		
		@Test(priority=1)
		public void verifyPageTitle(){
//			Assert the page title
			assertEquals(driver.getTitle(),"Training support");
			
		}
		
		@Test(priority=2)
		public void aboutPageTest() {
			driver.findElement(By.linkText("About Us")).click();
			assertEquals(driver.getTitle(),"About Training Support");
		}
		
		@AfterClass
		public void tearDown() {
			//close the browser
		
		driver.quit();
		}
		
		
		
	}


