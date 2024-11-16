package DependancyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyMethodsClass {

	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);	
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);		
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);	
	}
	
	@Test(priority=4, dependsOnMethods= {"login", "search"})	//Skipped - Both method should pass to execute advSearch()
	void advSearch()
	{
		Assert.assertTrue(true);	
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
