package MavenLearnings;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestAPITest {
	@Test
	public void PayCCBill()
	{
	System.out.println("Pay CC Bill");

	}
	@Test
	public void prerequvisit()
	{
		System.out.println("Am the first");
	}
	@Test
	public void PayRent()
	{
		System.out.println("Pay Rent");
		
	}
	@Test
	
	public void PayLoan()
	{
		System.out.println("Pay Loan");
		
	}
}
