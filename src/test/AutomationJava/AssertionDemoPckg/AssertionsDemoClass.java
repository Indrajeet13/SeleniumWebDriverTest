package AssertionDemoPckg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemoClass 
{
	@Test
	void testTitle()
	{
		String expec_title = "Opencart";
		String act_title= "Openshop";
		
		
		/*
		if(expec_title.equals(act_title))
		{
			System.out.println("Test are Passed...");
		}
		else
		{
			System.out.println("Test is failed");
		}
		*/
		
		//Assert.assertEquals(expec_title, act_title);
		
		if(expec_title.equals(act_title))
		{
			System.out.println("Test are Passed...");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test is failed");
			Assert.assertTrue(false);
		}
		
		
		
		
	}
	
	
}
