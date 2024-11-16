package POM_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Every Page object class contains
/*
Constructor
Locators 
Action methodds 

*/


//Page Factory Approch

public class LoginPage2 {

	WebDriver driver;
	
	
	//Constructor
	
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //MANDATORY
	}
	
	
	//Locators 
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement userName_loc;
	
	//@FindBy(xpath = "//input[@placeholder='Password']") 
	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']") 
	WebElement password_loc;
	
	@FindBy(xpath = "//button[normalize-space()='Login']") 
	WebElement loginBtn_loc;
	
	@FindBy(tagName="a") 
	List<WebElement> links;
	
	
	
	
	//Action methodds
	
	public void setUsername(String user)
	{
		userName_loc.sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		password_loc.sendKeys(pass);
	}
	
	public void clickLoginBtn()
	{
		loginBtn_loc.click();
	}
	
	
}
