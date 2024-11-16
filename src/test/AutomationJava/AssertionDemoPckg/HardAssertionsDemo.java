package AssertionDemoPckg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {

	@Test
	void test()
	{
		
		//HARD Assertions
		
		//Assert.assertEquals("xyz" , "xyz");
		//Assert.assertEquals(123 , 345);
		
		//Assert.assertEquals("xyz" , 123);
		
		//Assert.assertEquals("123" , 123);	//Fail - did not comopare String with int
		
		//Assert.assertNotEquals(123, 123);	//Failed
		//Assert.assertNotEquals(123, 354);	//Passed
		
		//Assert.assertTrue(true);	//Pass
		//Assert.assertTrue(false); //Failed
		
		//Assert.assertTrue(1==2);	//Failed
		//Assert.assertTrue(1==1);	//Passed
		
		//Assert.assertFalse(1==2); 	//Pass
		//Assert.assertFalse(1==1); 	//Failed
		
		//Assert.fail();
	}
	
}
