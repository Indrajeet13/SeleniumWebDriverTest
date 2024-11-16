package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_PaginationTable {

	public static void main(String[] args) throws InterruptedException 
	{
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//ul[@id='pagination']//a")).getText();
		
		int total_pages = driver.findElements(By.xpath("//ul[@id='pagination']//a")).size();
		System.out.println("Total Pages: "+total_pages);
		
		for(int p=1;p<total_pages;p++)
		{
			if(p > 1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//a[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int r=1;r<noOfRows;r++)
			{
				String Name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
			
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input[@type='checkbox']")).click();
				
				System.out.println(Name+"\t"+price);
				
				Thread.sleep(2000);
				
			}
			
			
		}
		driver.quit();
	}

}
