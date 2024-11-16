package TestNG_demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 
{
	@Test
	void xyz()
	{
		System.out.println("This is xyz from class c2");
	}
	
	@AfterTest
	void bt() 
	{
		System.out.println("This is AfterTest method.....");
	}
	
}
