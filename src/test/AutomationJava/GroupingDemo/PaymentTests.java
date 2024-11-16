package GroupingDemo;

import org.testng.annotations.Test;

public class PaymentTests {

	
	@Test(priority=1, groups = {"sanity", "regression","functional"})
	void paymentInRupees()
	{
		System.out.println("This is Payment in Rupees..");
	}
	
	@Test(priority=2, groups = {"sanity", "regression","functional"})
	void paymentInDollars()
	{
		System.out.println("This is Payment in Dollars..");
	}
	
}