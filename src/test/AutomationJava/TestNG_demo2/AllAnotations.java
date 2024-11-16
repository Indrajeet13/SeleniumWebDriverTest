package TestNG_demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations 
{

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
	
	@AfterTest
	void at() 
	{
		System.out.println("This is AfterTest method.....");
	}
	
	@BeforeTest
	void bt() 
	{
		System.out.println("This is BeforeTest method.....");
	}
	
	@Test
	void abc()
	{
		System.out.println("This is abc from class c1");
	}
	
	@Test
	void xyz()
	{
		System.out.println("This is xyz from class c2");
	}
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is Before Method login...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is After Method logout...");
	}
	
	@BeforeClass
	void bclass()
	{
		System.out.println("This is Before Class login...");
	}
	
	@AfterClass
	void aclass()
	{
		System.out.println("This is After Class logout...");
	}
	
	
}
