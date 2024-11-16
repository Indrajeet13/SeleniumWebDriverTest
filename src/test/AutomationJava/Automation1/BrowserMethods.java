package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(5000);
		//driver.close(); 	//Close single browser window whenever the driver is focused 
		driver.quit();		//Close all the browser windows
		
	}

}
