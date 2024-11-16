package Automation1;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 
{
	static void getMonth(WebDriver driver, String month)
	{
		//Select month
		//using for loop
		for(int i=0; i<12; i++) 
		{
			String currentSelectedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(currentSelectedMonth);  
			    
			if(month.equals(currentSelectedMonth))
			{
			    break; // Break the loop once the correct month is found
			} 
			else 
			{
			        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click "Next" to move forward in months
			}
		}
		
		//using while loop
		/*
		while(true)
		{
			//select month
			String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(displayMonth);
			if(month.equals(displayMonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
		*/	
	
	}
	
	
	static void getYear(WebDriver driver, String requiredYear)
	{
		//select year
		
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText(requiredYear);

	}
	
	
	static void selectDate(WebDriver driver, String requiredDate)
	{
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(requiredDate))
			{
				dt.click();
				break;
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String requiredYear = "2025";
		String requiredMonth = "April";
		String requiredDate = "22";
		
		driver.switchTo().frame("frame-one796456169");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		getMonth(driver, requiredMonth);
		
		getYear(driver, requiredYear);
		
		selectDate(driver, requiredDate);
	
		
		
	}

}
