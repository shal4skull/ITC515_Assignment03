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
import library.interfaces.entities.IMember;
import library.interfaces.hardware.IScannerListener;

public class CardSwipedTestCase1 {

	@Before
	public void setUp() throws Exception {
	}

	// This test is BBUC_Op2: Swipe Borrower Card. 
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
		
		// Add the listener.
		IScannerListener listener = bookScan;
		scanner.addListener(listener); 
		
		// Initiate the memberID.
		MemberHelper mb = new MemberHelper();
		MemberMapDAO ma = new MemberMapDAO(mb);
		IMember member = ma.addMember("Wing", "Tsoi", "0420654682", "edmondtsoi92@gmail.com");
		int memberID = member.getID();
		// Test passed:
		// assertEquals(EMemberState.BORROWING_ALLOWED, Wing.getState());
		
		// Test cardSwiped method.
		bookScan.initialise();
		bookScan.cardSwiped(memberID);
	}

}

// The result returns "INITIALIZED" state as expected.