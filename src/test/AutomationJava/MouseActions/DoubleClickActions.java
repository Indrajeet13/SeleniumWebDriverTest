package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Switch to iframe 
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//Thread.sleep(2000);
		
		box1.clear();	//clear box1
		box1.sendKeys("Welcome");
		
		//Double click action on button
		
		act.doubleClick(button).perform();
		
		//Get the value from value attribute
		String text = box2.getAttribute("value");
		System.out.println("Captured Value : "+text);
		
		//Validation : box2 should contains "Welcome"
		
		if(text.equals("Welcome"))
		{
			System.out.println("Text Copied..");
		}
		else
		{
			System.out.println("Text not copied properly");
		}
		
	}

}
