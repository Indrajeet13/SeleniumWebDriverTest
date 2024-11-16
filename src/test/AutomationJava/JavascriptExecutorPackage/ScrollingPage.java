package JavascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//1. Scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0, 3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
	//2. Scroll the page till the element is visible

		//WebElement ele = driver.findElement(By.xpath("//td[normalize-space()='India']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));	//7695 pixels
		
	//3. Scroll page till end of page
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));	//9474
		
		
		Thread.sleep(5000);
	//Scrolling up to initial position
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	//For horizontal scroll bar
		//Only change in pageXOffset, scrollWidth
		
		
		
	}

}
