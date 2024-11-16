package JavascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
		
		
		//using java script executor
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//JavascriptExecutor js = driver;
		
		js.executeScript("arguments[0].setAttribute('value','john)", inputBox);
		
		
		//Clicking on elemnent 
		WebElement rdButton = driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()", rdButton);
		
	}

}
