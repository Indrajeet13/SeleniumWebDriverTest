package Automation1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> searchResultLinks = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link' or @id=\"Wikipedia1_wikipedia-search-more\"]//a"));
		
		int linkCount = searchResultLinks.size();
		System.out.println("Total number of search result links: " + linkCount);
		
		String originalWindowHandle = driver.getWindowHandle();
		
//		Set<String> windowIDs = driver.getWindowHandles();
//		List<String> windowHandlesList = new ArrayList<>(windowIDs);
		
		for(int i=0;i<linkCount; i++)
		{
			WebElement link = searchResultLinks.get(i);
			System.out.println(link.getText());
			link.click();
			
			Set<String> windowIDs = driver.getWindowHandles();
            List<String> windowHandlesList = new ArrayList<>(windowIDs);
			
            String newWindowHandle = windowHandlesList.get(windowHandlesList.size() - 1);
            
            // Switch to the new window/tab
            driver.switchTo().window(newWindowHandle);
            
            // Print the window ID and title of the new window/tab
            System.out.println("Window ID: " + newWindowHandle);
            System.out.println("Title: " + driver.getTitle());
            
            String title = driver.switchTo().window(newWindowHandle).getTitle();
            
            if(title.equals("More »") || title.equals("Selenium in biology - Wikipedia"))
			{
				driver.close();
			}
            
            
            // Switch back to the original window
            driver.switchTo().window(originalWindowHandle);
		}
		

	}

}
