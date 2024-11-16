package Automation1;

//Check the all checkboxes on the table 


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//tbody//tr//td//input[@type='checkbox']"));
		
		/*
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		*/
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
	}
}
