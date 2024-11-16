package TestNG_demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 
{
	@Test
	void pqr()
	{
		System.out.println("This is pqr from class c3");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite method .....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite method .....");
	}
	
}
