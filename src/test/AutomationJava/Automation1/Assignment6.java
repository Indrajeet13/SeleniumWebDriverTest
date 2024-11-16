package Automation1;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



//Perform actions on the URL - https://blazedemo.com/

//1. find lowest price and click on the choose flight button
//2. fill the form on next page
//3. Verify the message "Thank you for your purchase today!"

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//Select Departure City
		WebElement depCityElement = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depCity = new Select(depCityElement);

		depCity.selectByVisibleText("Paris");
		
		//Select Destination City
		WebElement destCityElement = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destCity = new Select(destCityElement);

		destCity.selectByVisibleText("London");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//Calculate number of rows
		int rows = driver.findElements(By.xpath("//table//tbody//tr")).size();
		System.out.println("Rows: "+rows);
		
		//Calculate number of rows
		int columns = driver.findElements(By.xpath("//table//tbody//tr[1]//td")).size();
		System.out.println("Columns :"+columns);
		
		String[] prices = new String[rows]; 
				
		for(int i=1;i<=rows;i++)
		{
			String priceText = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[6]")).getText();
			prices[i-1] = priceText;
			
			//System.out.println(i+":"+priceText);
		}
		
		// Sort the prices
		Arrays.sort(prices);
		System.out.println("Sorted Prices: " + Arrays.toString(prices));
		
		
		// Find the lowest price flight by using the sorted array
		String lowestPrice = prices[0];
		System.out.println(lowestPrice);	
		
		// Loop through the rows again to find the lowest price in the table and click the button
		 for (int i = 1; i <= rows; i++) 
		 {
	            String priceInRow = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[6]")).getText();
	            
	            if (priceInRow.equals(lowestPrice)) 
	            {
	                // Click the "Choose Flight" button in the row with the lowest price
	                driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[1]//input")).click();
	                break;
	            }
	        }
		
		 // Fill out the form on the next page
	        driver.findElement(By.id("inputName")).sendKeys("John Doe");
	        driver.findElement(By.id("address")).sendKeys("123 Main St");
	        driver.findElement(By.id("city")).sendKeys("New York");
	        driver.findElement(By.id("state")).sendKeys("NY");
	        driver.findElement(By.id("zipCode")).sendKeys("10001");
	        driver.findElement(By.id("creditCardNumber")).sendKeys("1234567890123456");
	        driver.findElement(By.id("nameOnCard")).sendKeys("John Doe");
	        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
	        String successMessage = driver.findElement(By.tagName("h1")).getText();
	        
	        if(successMessage.equals("Thank you for your purchase today!"))
	        {
	        	System.out.println("Purchase Successfull");
	        }
	        else {
	            System.out.println("Purchase failed.");
	        }

	        //driver.quit();
	}

}
