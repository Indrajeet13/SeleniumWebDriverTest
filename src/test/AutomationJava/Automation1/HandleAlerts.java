package Automation1;

/*
Alert myalert = driver.switchTo().alert();
myalert.accept();
myalert.dismiss();
myalert.getText();
myalert.sendKeys();

*/

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	//1. Normal Alert with OK button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();	//To accept the alert or click on OK button
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		driver.quit();
		*/
		
	//2. Normal Alert with OK and Cancel button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();	//Close alert using OK button
		driver.switchTo().alert().dismiss(); //Close alert using Cancel button
		*/
		
	//3. Prompt Alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.sendKeys("Welcome");
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.quit();
		
	}

}
