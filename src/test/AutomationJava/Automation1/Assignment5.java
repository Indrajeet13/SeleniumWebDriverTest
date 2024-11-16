package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		
		
		WebElement drpCountryElement = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry = new Select(drpCountryElement);
		
		drpCountry.selectByVisibleText("India");
		
		//Thread.sleep(3000);
		
		WebElement drpStateElement = driver.findElement(By.xpath("//select[@id='state-list']"));
		Select drpSatate = new Select(drpStateElement);
		
		drpSatate.selectByVisibleText("Delhi");
		
	}

}
