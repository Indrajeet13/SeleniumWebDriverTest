package ScreenshotPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
	//1. Full page screenshot	
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//File targetFile = new File("D:\\Workspace Eclipse\\seleniumWebdriver\\Screenshots\\FullPage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\FullPage.png");	//Dynamic file location
		sourceFile.renameTo(targetFile);	//Copy source file to target file 
		*/
		
	//2. Capture Screenshot of specific area of the page
		/*
		WebElement featuredProductSection = driver.findElement(By.xpath("//div[@id='feature']//div[@class='row hidden-sm']"));
		
		File sourceFile = featuredProductSection.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\featuredProducts.png");	//Dynamic file location
		sourceFile.renameTo(targetFile);
		*/
		
	//3. Capture Screenshot of webElement 
		
		WebElement logo = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");	//Dynamic file location
		sourceFile.renameTo(targetFile);
		
		
		driver.quit();
		
		
	}

}
