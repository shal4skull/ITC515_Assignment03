//Author: Tsoi Wing Kui
//Student number: 11593536

package library.entities;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class BorrowTestCase3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	// This test tests the case in which the loan parameter is null.
	public void testBorrow() {
		// Assign the book "a" is going to be borrowed by the member "b" (Wing Tsoi).
		Book a = null;
		Member b = null;
		Date c = null;
		Date d = null;
		Loan LoanA = new Loan(a, b, c, d);
		// Test the condition when the loan parameter is null.
		assertNull(LoanA);
	}

}

//The result returns IllegalArgumentException as expected.