package UploadFilePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		//Single file upload - Test1.csv
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Indrajeet.Yadav\\Downloads\\Test1.csv");
		
		String filename = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		
		if(filename.equals("Test1.csv"))
		{
			System.out.println("File is successfully uploaded");
		}
		*/
		
		//Multiple file upload 
		String file1 = "C:\\Users\\Indrajeet.Yadav\\Downloads\\Test1.csv";
		String file2 = "C:\\Users\\Indrajeet.Yadav\\Downloads\\Test2.csv";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		
		//Validation 1 - Number of files
		if(noOfFilesUploaded == 2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//Validate file name
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.csv") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.csv"))
		{
			System.out.println("Files names are matching");
		}
		else
		{
			System.out.println("File names are not matching");			
		}
		
		
		
		
	}

}
