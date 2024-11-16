package Automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//1. Select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
	//2. Select multiple checkboxes
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		*/
		
	//3. Select last 3 checkboxes
			//total no of checkboxes - how many checkboxes want to select = starting index
			//7-3 =4 (Starting index)
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
	//4. Select last 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
	//5. Unselect checkboxes if they are selected 
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
