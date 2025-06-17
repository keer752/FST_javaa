package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {
		

//		Intialize driver
		
		WebDriver driver = new FirefoxDriver();

//		open the browser or page
		
		driver.get("https://training-support.net");
//		page instructions
//		print the page title
		System.out.println(driver.getTitle());
		
//		close the browser
		driver.quit();
	}
	}

