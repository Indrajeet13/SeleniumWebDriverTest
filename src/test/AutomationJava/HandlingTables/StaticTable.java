package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	
		
	//1) Find total number of rows in a table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();	//multiple table
		//int rows = driver.findElements(By.tagName("tr")).size();	//Single table in webpage
		
		System.out.println("Number of rows :"+rows);
		
	//2) find total number of columns in table
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //multiple table
		//int columns = driver.findElements(By.tagName("th")).size(); //Single table in webpage
		
		System.out.println("Number of columns :"+columns);

	//3)Read data from the specific row and Column (ex: 5th row and 1st column)	
		
		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookName);	//Master in Selenium
		
	//4) Read data from all rows and colums
		/*
		System.out.println("BookName"+"\t"+"Author"+"\t"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<rows;r++)
		{
			for(int c=1;c<columns;c++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();	//Passed r and c parameters to xpath
				
				System.out.print(data +"\t");
				
			}
			System.out.println();
		}
		*/
		
	//5) Print bookname whoes author is Mukesh
		
		/*
		for(int r=2;r<rows;r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(authorName);
			
			if(authorName.equals("Mukesh"))
			{
				String bookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName1+"\t"+authorName);
			}
			
		}
		*/
		
	
	//6) Find total price of all the books
		int total =0;
		for(int r=2;r<rows;r++)
		{
			String prices = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(prices);
			
			total = total + Integer.parseInt(prices);
		}
		System.out.println("Total price of the books : "+total);
		
		
	}

}
