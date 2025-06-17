package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/tables");
	
	System.out.println(driver.getTitle());
//	find the number of rows and columns in the table and print them.
	
	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	System.out.println("Number of rows:"+rows.size());
	List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	System.out.println("Number of columns:"+cols.size());
	
//	find and click the add row button.
	driver.findElement(By.xpath("//button[contains(text(),'Add Row')]")).click();
//	find the newly added row and add the following data:
	
//	Id:10
//	Book Name:Hover car Racer
//	ASIN:030440160
//	Price:$7.99
	
	
	String[] dataToAdd = {"10","Hover car Racer","mathew Reilly","0330440160","$7.99"};
	
	for(int i = 0; i < dataToAdd.length;i++) {
		By lastRowCells = By.xpath("//table/tbody/tr[last()]/td["+(i+1)+"]");
		driver.findElement(lastRowCells).clear();
		driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
	}
	
	
	
	
//	print the data from the newly added row.
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
	driver.quit();

    } 
  }