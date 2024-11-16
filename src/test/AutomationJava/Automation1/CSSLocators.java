package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag id	tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		//tag class		tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
		
		//tag attribute		tag[attribute="Value"]
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
		
		//tag class attribute		tag.classname[attribute="Value"]
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("T-Shirts");
		
		
		
	}

}
