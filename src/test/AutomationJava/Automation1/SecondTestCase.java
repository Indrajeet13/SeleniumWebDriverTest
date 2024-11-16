package Automation1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
1) Launch browser (Chrome)
2) Open URL https://demo.noncommerce.com/
3) Validate title should be "nonCommerce demo store"
4) Close browser
*/

public class SecondTestCase 
{

	public static void main(String[] args) 
	{
		//1) Launch browser(chrome)
		
				//ChromeDriver driver = new ChromeDriver();
				ChromeDriver driver = new ChromeDriver();
			
			//2) Open URL https://demo.opencart.com/
				
				driver.get("//demo.noncommerce.com/");
				
			//3) Validate title should be "Your Store"

				String actual_title = driver.getTitle();
				
				if(actual_title.equals("nonCommerce demo store"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
						
			//4) Close browser		
				
				//driver.close();
				//driver.quit();

	}

}
