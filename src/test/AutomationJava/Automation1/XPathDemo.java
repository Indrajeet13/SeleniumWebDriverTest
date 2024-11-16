package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	//XPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
	//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("TShirts");
		
		
	//XPath with 'and', 'or' operator
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TShirts");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("TShirts");
		
	//XPath with inner text - text()
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//String Value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(Value);
		
	//XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-Shirts");
		
	//XPath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-Shirts");
		
	//Chained XPath
		//driver.findElement(By.xpath("//div[@id='logo']/a/img")).sendKeys("T-Shirts");
		
		
		
		
	}

}
