package OptionsClassesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);	//Access SSL Certificates
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");	
		
		String act_title = driver.getTitle();	//Privacy Error
		
		System.out.println(act_title);	//expired.badssl.com

	}

}
