package Automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment9_DatePickers {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
	
		String Date = "10";
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='source[]']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//form[@id='flight_oneway']//ul[@class='suggestions-list']//div//p[text()='Chhatrapati Shivaji International Airport, ']")).click();
		
		driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='destination[]']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//p[normalize-space()='Chennai International Airport,']")).click();
		
		
		
		
		driver.findElement(By.id("dp1725973479282")).click();
		
		Thread.sleep(2000);
		
		WebElement yearDrpDwn = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectYear = new Select(yearDrpDwn);
		selectYear.deselectByVisibleText("2023");
		
		WebElement monthDrpDwn = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectMonth = new Select(monthDrpDwn);
		selectMonth.deselectByVisibleText("April");
		
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table//tr//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}
		
		
		Thread.sleep(3000);
	}

}
