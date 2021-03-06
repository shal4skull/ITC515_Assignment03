//Author: Tsoi Wing Kui
//Student number: 11593536

package library;

import org.junit.Before;
import org.junit.Test;
import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.daos.LoanHelper;
import library.daos.LoanMapDAO;
import library.daos.MemberHelper;
import library.daos.MemberMapDAO;
import library.hardware.CardReader;
import library.hardware.Display;
import library.hardware.Printer;
import library.hardware.Scanner;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class CardSwipedTestCase2 {

	@Before
	public void setUp() throws Exception {
	}

	// This test is BBUC_Op2: Swipe Borrower Card. 
	// Testing postConditions: member exists and not restricted.
	@Test
	public void testCardSwiped() {
		
		// Create a BorrowUC_CTL object.
		CardReader reader = new CardReader();
		Scanner scanner = new Scanner();
		Printer printer = new Printer(); 
		Display display = new Display(); 
		BookHelper a = new BookHelper();
		BookMapDAO bookDAO = new BookMapDAO(a);
		LoanHelper b = new LoanHelper();
		LoanMapDAO loanDAO = new LoanMapDAO(b);
		MemberHelper c = new MemberHelper();
		MemberMapDAO memberDAO = new MemberMapDAO(c);
		BorrowUC_CTL bookScan = new BorrowUC_CTL(reader, scanner, printer, display, bookDAO, loanDAO, memberDAO);
		
		// Create a new book and initiate the bookID.
		IBook book = bookDAO.addBook("author", "title", "callNo");
		int bookID = book.getID();
		
		// Create a new member and initiate the memberID.
		IMember member = memberDAO.addMember("Wing", "Tsoi", "0420654682", "edmondtsoi92@gmail.com");
		int memberID = member.getID();
		
		// Test cardSwiped method and bookScanned method.
		bookScan.initialise();
		bookScan.cardSwiped(memberID);		
		bookScan.bookScanned(bookID);
	}

}

// The result returns "SCANNING_BOOKS" state as expected.
