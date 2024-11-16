package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Minimum slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default Location of minimun slider : "+min_slider.getLocation());	//(58, 249) = (x, y)
		
		act.dragAndDropBy(min_slider, 100, 249).perform(); // 100+58
		
		System.out.println("Location of minimun slider after changing : "+min_slider.getLocation()); //(158, 250)
		
		//Maximum slider
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Default Location of minimun slider : "+max_slider.getLocation());	//(766, 250) = (x, y)
		
		act.dragAndDropBy(max_slider, -66, 249).perform(); 
		
		System.out.println("Location of minimun slider after changing : "+max_slider.getLocation());	//(702, 250)
		
		
		
		
		
	}

}
