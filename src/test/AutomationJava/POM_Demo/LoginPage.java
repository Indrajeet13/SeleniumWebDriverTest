package POM_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Every Page object class contains
/*
Constructor
Locators 
Action methodds 

*/

public class LoginPage {

	WebDriver driver;
	
	
	//Constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators 
	
	By userName_loc = By.xpath("//input[@placeholder='Username']");
	By password_loc = By.xpath("//input[@placeholder='Password']");	
	By loginBtn_loc = By.xpath("//button[normalize-space()='Login']");
	
	
	//Action methodds
	
	public void setUsername(String user)
	{
		driver.findElement(userName_loc).sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(password_loc).sendKeys(pass);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn_loc).click();
	}
	
	
}
