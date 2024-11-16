package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Selenium");
		
		//ctrl+A - Select all text
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl+c - copy the text into clipboard
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB - shift to 2n box
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl+v - paste the text
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
// Ex : Ctrl+shift+A
// act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	
// EX : Enter
// act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
	}

}
