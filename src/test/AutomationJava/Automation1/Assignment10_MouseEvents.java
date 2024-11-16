package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//URL - https://testautomationpractice.blogspot.com/

public class Assignment10_MouseEvents {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Selenium");
		
		act.doubleClick(button).perform();
		
		if(box2.getAttribute("value").equals("Selenium"))
		{
			System.out.println("Text Copied..");
		}
		else
		{
			System.out.println("Text not copied properly");
		}
		
		
		
		
		
	}

}
