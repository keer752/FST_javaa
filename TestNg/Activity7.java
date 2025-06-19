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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	// webDriver declaration
		WebDriver driver;
//		webDriverWait declaration
		WebDriverWait wait;

		@BeforeClass
		public void setup() {
//			Intialize driver
			driver = new FirefoxDriver();
//			Intialize wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//			 open the page
			driver.get("https://training-support.net/webelements/login-form/");
		}

		@Test(priority = 1)
		public void verifyPageTitle() {
//			Assert the page title
			assertEquals(driver.getTitle(), "Selenium: Login Form");

		}
		
		@DataProvider(name = "Credentials")
		public Object[][] creds(){
			//Return incorrect credentials for text
			return new Object[][] {
				{"user1","password"},
				{"DROP TABLE USERS:","somePassword"},
				{"admin","js.alert()"},
				{"{0_0}","{-_-}"},
				{"wonguser","password"}
			};
			}
		

		@Test(priority = 2,dataProvider = "Credentials")
		public void loginFailTest(String username,String password) {
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
//			find and print the error message
			String message = driver.findElement(By.id("subheading")).getText();
			assertEquals(message, "Invalid credentials");
		}

		// Test for succesfull login
		@Test(priority = 3)
		public void loginSuccessTest() {
			// find the username
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			// find the password
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("password");
			// fond the and click submit button
			driver.findElement(By.xpath("//button[text()='Submit']")).click();

//			find and print the sucess message
			String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500")))
					.getText();
			assertEquals(message, "Login Success!");
		}

		@AfterClass
		public void tearDown() {
			// close the browser

			driver.quit();
		}

	}


