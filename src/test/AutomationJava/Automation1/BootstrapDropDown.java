package Automation1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();	//Open dropdown options
		
	//1. Select Single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
	//2. Capture all the options and find out the size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options :"+options.size()); //14
		
	//3. Printing options from dropdown
		/*
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
		
	//4. Select multiple options
		
		for(WebElement op:options)
		{
			String option = op.getText();
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
			{
				op.click();
			}
		}
		
		
		
		
	}

}
