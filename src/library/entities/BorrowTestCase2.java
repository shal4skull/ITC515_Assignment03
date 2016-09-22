//Author: Tsoi Wing Kui
//Student number: 11593536

package library.entities;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class BorrowTestCase2 {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	// This test tests the case in which the borrower borrows a book unavailable.
	public void testBorrow() {
		// Assign the book "a" has been borrowed by the member "b" (Wing Tsoi).
		Book a = new Book("author1", "title1", "callNo1",1);
		Member b = new Member("Wing", "Tsoi", "0420654682", "edmondtsoi92@gmail.com", 1);
		Date c = new Date(1);
		Date d = new Date(2);
		Loan LoanA = new Loan(a, b, c, d);
		// Test if the book has been borrowed.
		a.borrow(LoanA);
		// The result returns true.
		assertEquals(EBookState.ON_LOAN, a.getState());
		// Show RuntimeException.
		a.borrow(LoanA);
	}

}

// The result returns RuntimeException which is expected.