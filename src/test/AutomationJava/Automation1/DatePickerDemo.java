package Automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo 
{
	//Select Future date
	static void selectFutureDate(WebDriver driver, String year, String month, String date)
	{
		while(true)
		{
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	 //year	
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	//month
			
			if(currentYear.equals(year) && currentMonth.equals(month))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	//next
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for(WebElement dt:allDates)
			{
				if(dt.getText().equals(date))
				{
					 dt.click();
					 break;
				 }
			}
	}
	
	//Select Past date
		static void selectPastDate(WebDriver driver, String year, String month, String date)
		{
			while(true)
			{
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	 //year	
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	//month
				
				if(currentYear.equals(year) && currentMonth.equals(month))
				{
					break;
				}
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				
			}
			
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			
			for(WebElement dt:allDates)
				{
					if(dt.getText().equals(date))
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
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame(0); 
		
	//Method 1 : Using sendkeys();
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");	//dd/mm/yyyy
		
	//Method 2 : Using date picker element  
		
		String year = "2026";
		String month = "April";
		String date = "12";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();	//open date picker
		
		//selectFutureDate(driver, year, month, date);
		
		selectPastDate(driver, "2023", "June", "22");
		
		
		
	}

}
