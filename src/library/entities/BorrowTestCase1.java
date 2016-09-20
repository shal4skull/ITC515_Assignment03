//Author: Tsoi Wing Kui
//Student number: 11593536

package library.entities;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class BorrowTestCase1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	// This test tests the case in which the borrower borrows a book available with the loan parameter.
	public void testBorrow() {
		// Assign the book "a" is going to be borrowed by the member "b" (Wing Tsoi).
		Book a = new Book("author1", "title1", "callNo1",1);
		Member b = new Member("Wing", "Tsoi", "0420654682", "edmondtsoi92@gmail.com", 1);
		Date c = new Date(1);
		Date d = new Date(2);
		Loan LoanA = new Loan(a, b, c, d);
		// Test whether the loan value is passed.
		a.borrow(LoanA);
		assertTrue(a.getLoan() == LoanA);
	}

}

//The result returns true which is expected and should run in IllegalArgumentException in the program.