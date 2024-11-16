package Automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		
		WebElement drpCountryElement = driver.findElement(By.xpath("//*[@id='country']"));
		Select drpCountry = new Select(drpCountryElement);
		
	//Select option from the dropdown
		
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("japan");
		//drpCountry.selectByIndex(3);
		
	//Capture the options from the background
		
		List<WebElement>options = drpCountry.getOptions();
		
		System.out.println("total number of options in a DropDown :"+options.size());
		
	//Printing the options
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		*/
		
		//Using enhanced for loop
		for(WebElement option : options)
		{
			System.out.println(option.getText());
		}
		
		
		
	}

}
