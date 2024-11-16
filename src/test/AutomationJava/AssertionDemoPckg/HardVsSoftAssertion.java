package AssertionDemoPckg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	
	//@Test
	void test_hardAssertions()
	{
		System.out.println("Testign....");
		System.out.println("Testign....");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
	}
	
	@Test
	void test_softAssertions()
	{
		System.out.println("Testign....");
		System.out.println("Testign....");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);	//soft assertion
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa.assertAll(); //Mandatory
		
	}
	
}
