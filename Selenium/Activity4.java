package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println(driver.getTitle());

		System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
		Color headingColor = Color
				.fromString(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
		System.out.println(headingColor.asHex());

		System.out.println(driver.findElement(By.cssSelector("button.bg-purple-200")).getDomAttribute("class"));
		System.out.println(driver.findElement(By.cssSelector("button.bg-slate-200")).getText());
//		String message = driver.findElement(By.xpath("//h3[(@class='text-3xl font-bold text-orange-600')]")).getText();
//		System.out.println("text of third header:"+message);
//		
//		String color = driver.findElement(By.xpath("//h5[(@class='text-3xl font-bold text-purple-600')]")).getCssValue("color");
//		System.out.println("color of header:"+color);
//		
//		String classes = driver.findElement(By.className("bg-purple-200")).getAttribute("class");
//		System.out.println("classes of purple:" + classes);
//		
//		String slate = driver.findElement(By.className("bg-slate-200")).getText();
//		System.out.println("text of slate:" + slate);

//	//find the success page
//	
//	String message = driver.findElement(By.tagName("h1")).getText();
//	System.out.println(message.equals("Login Success!"));
		driver.quit();
	}
}
