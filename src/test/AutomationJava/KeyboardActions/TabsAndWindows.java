package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabsAndWindows 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		//selenium 4.x onwards
		//driver.switchTo().newWindow(WindowType.TAB);	//opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW);	// opens new window
		
		
		driver.get("https://opencart.com/");
		
		

	}
}
