package Automation1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		//String windowID = driver.getWindowHandle();
		//System.out.println("Window ID : "+windowID);
	
		//getWindowHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowID = driver.getWindowHandles();
		System.out.println("Window ID : "+windowID);
		
		driver.close();
		
		
		
		
	}

}
