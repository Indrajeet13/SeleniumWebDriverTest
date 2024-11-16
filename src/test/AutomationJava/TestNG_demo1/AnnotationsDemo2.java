package TestNG_demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1) Login	-- @BeforeClass
2) Search	-- @Test
3) Advanced Search	-- @Test
4) Logout	-- @AfterClass
*/

public class AnnotationsDemo2 
{
	@BeforeClass
	void login()
	{
		System.out.println("This is Before Class login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is Search...");
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("This is advanced Search...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
	
}
