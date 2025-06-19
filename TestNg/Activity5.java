package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	// webDriver declaration
	WebDriver driver;
//	webDriverWait declaration
	WebDriverWait wait;

	@BeforeClass(alwaysRun=true)
	public void setup() {
//		Intialize driver
		driver = new FirefoxDriver();
//		Intialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		 open the page
		driver.get(" https://training-support.net/webelements/target-practice");

	}

	@Test(groups = {"HeaderTests","ButtonTests"})
	public void pageTitleTest() {
     String title = driver.getTitle();
     System.out.println("Title is:"+title);
     Assert.assertEquals(title, "Selenium: Target Practice");
}
	@Test(dependsOnMethods = {"pageTitleTest"},groups = {"HeaderTests"})
	public void HeaderTests() {
		WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class,'orange')]"));
		Assert.assertEquals(header3.getText(), "Heading #3");
	}
	
	@Test(dependsOnMethods = {"pageTitleTest"},groups = {"HeaderTests"})
	public void HeaderTest2() {
		Color header5Color = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Assert.assertEquals(header5Color.asHex(),"#9333ea" );
	}
	@Test(dependsOnMethods = {"pageTitleTest"},groups = {"ButtonTests"})
	public void ButtonTest() {
		WebElement button1 = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
		Assert.assertEquals(button1.getText(), "Emerald");
	}
	@Test(dependsOnMethods = {"pageTitleTest"},groups = {"ButtonTests"})
	public void ButtonTest2(){
		Color button2Color = Color.fromString(driver.findElement(By.cssSelector("button.text-purple-900")).getCssValue("color"));
		Assert.assertEquals(button2Color.asHex(), "#581c87");
		
//		Find and assert the colour of the first button in the third row.
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		//close the browser
		driver.quit();
	}

	}
		
	
