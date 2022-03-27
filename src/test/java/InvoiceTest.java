import org.junit.*;

import com.Day30TDD.InvoiceGenerator;
import com.Day30TDD.Ride;


/**
 * In this we have written the test cases for our program
 * We are using the TDD approach here.
 *  @Before annotation are run before each test. This is useful when we want to execute some common code before running a test.
 */
public class InvoiceTest {
	InvoiceGenerator invoice;
	@Before 
	public void initialization() {
		invoice = new InvoiceGenerator();
	}
	
	/**
	 * We have written this test case to check the total fare.
	 * Here 10 X 10 = 100 + 3 X 1 =3
	 * So total Rs.103
	 */
	@Test
	public void testGenerateInvoice() {
		
		Assert.assertEquals(103, invoice.generateInvoice(new Ride(10, 3)), 0.0);
	}
	/**
	 * Test case to check for minimum fare.
	 * If the fare is less that Rs.5 then we our min fare will be Rs.5.
	 */
	@Test
	public void testGenerateInvoice_getMin() {
		
		Assert.assertEquals(5, invoice.generateInvoice(new Ride(0.1, 1)), 0.0);
	}
	
	/**
	 * Test case to test multiple rides.
	 */
	@Test
	public void testGenerateInvoice_multipleRides() {
		
		Ride [] rides = {new Ride(0.1, 2), new Ride(10, 3)};
		Assert.assertEquals(108, invoice.generateInvoice(rides), 0.0);
	}
}