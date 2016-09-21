package library.daos;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import library.entities.Book;
import library.entities.Member;
import library.interfaces.entities.ILoan;

public class ReserveBookTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//This test test the reserve book use case
	//The result should be an ILoan object return
	//The test returns the ILoan subject as expected
	public void test() {
		Book b = new Book("author1", "title1", "callNo1",1);
		Member m = new Member("fName0", "lName0", "0001", "email0",1);
		Date borrowDate = new Date(1);
		Date dueDate = new Date(15);
		LoanHelper lh = new LoanHelper();
		
		ILoan loan = lh.makeLoan(b, m, borrowDate, dueDate);
		assertNotNull(loan);
	}


}
