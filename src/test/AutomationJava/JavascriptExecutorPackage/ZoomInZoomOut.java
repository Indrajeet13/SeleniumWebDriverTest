package JavascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='50%'");	//set zoom level 50%
		Thread.sleep(5000);

		js.executeScript("document.body.style.zoom='80%'"); //set zoom level 80%
		Thread.sleep(5000);
		
	}

}
