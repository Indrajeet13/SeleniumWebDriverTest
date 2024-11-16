package TestNG_Demo;

import org.testng.annotations.Test;

/*
1. open App
2. Login
3. Logout 

*/

public class FirstTestCase 
{	
	@Test(priority=10)
	void logout()
	{
		System.out.println("Logout to application...");
	}
	
	@Test(priority=0)
	void login()
	{
		System.out.println("Login to application...");
	}
	
	@Test(priority=-1)
	void openapp()
	{
		System.out.println("Opening application...");
	}
	
}
