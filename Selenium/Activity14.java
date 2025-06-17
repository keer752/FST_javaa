package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.escape.Escapers.Builder;

public class Activity14 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/tables");
	
	System.out.println(driver.getTitle());
//	Find the number of rows and columns in the table and print them.
	
	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	System.out.println("Number of rows:"+rows.size());
	List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	System.out.println("Number of columns:"+cols.size());
	
//	Find and print the Book Name in the 5th row.
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
//	Click the header of the Price column to sort it in ascending order.
	
	
	driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
//	Find and print the Book Name in the 5th row again.
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
	
	driver.quit();
}
}
