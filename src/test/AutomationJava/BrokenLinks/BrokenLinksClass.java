package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksClass {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links : "+links.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefAttributeValue = linkElement.getAttribute("href");
		
			if(hrefAttributeValue == null || hrefAttributeValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. So not possible to check");
				continue;	
			}
			
			//Send or hit URL to server
			try
			{
				URL linkURL = new URL(hrefAttributeValue);	//Converted href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();	//open connection to the server
				conn.connect();	//Connect to server and send request to server
			
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefAttributeValue + "--->It is broken link");
					noOfBrokenLinks++;
				}
				else
				{
					System.out.println(hrefAttributeValue + "--->Not a broken link");
				}
			}catch(Exception e)
			{
			}	
		}
		System.out.println("Number of Broken Links : "+noOfBrokenLinks);
		
		driver.quit();
		
	}

}
