package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
	//isDisplayed()
		
		//WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
		//System.out.println("Display status of Logo : "+logo.isDisplayed());
		
		//boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
		//System.out.println("Display status of Logo : "+status);
		
	//isEnabled()
		
		//boolean status = driver.findElement(By.xpath("//input[@placeholder='Username']")).isEnabled();
		//System.out.println("Enable status : "+status);
		
	//isSelected()
		//WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		//WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//System.out.println("Before Selection.....");
		//System.err.println(male_rd.isSelected());	//false
		//System.err.println(female_rd.isSelected()); //true
		
		//System.out.println("After Selecting male... ");
		//male_rd.click();	//select male radio button
		
		//System.err.println(male_rd.isSelected());	//true
		//System.err.println(female_rd.isSelected());	//false
		
		
		
		
		
		
	}

}
