
package HandlingTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {
	
	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver = new ChromeDriver();	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		WebDriver driver = new ChromeDriver(options);

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Explicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait for element searches

		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-username")));;
		username.clear();
		username.sendKeys("demo");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		if(driver.findElement(By.xpath("//button[@class = 'btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class = 'btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Showing 1 to 10 of 19081(1909 Pages)
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//repeating pages
		
		for(int p=1;p<total_pages;p++)
		{
			if(p > 1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data from page
			
			int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
				
			for(int r=1;r<noOfRows;r++)
			{
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(customerName+"\t"+email+"\t"+status);
	
				
			}	
			
		}
		
		
	}

}

		
		
		        