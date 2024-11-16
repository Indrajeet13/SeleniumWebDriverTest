package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		
	//implicit wait	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//driver.close();
		
		
		
		
	}

}
