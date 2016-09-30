//Author: Tsoi Wing Kui
//Student number: 11593536

package library.panels;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import library.BorrowUC_CTL;
import library.Main;
import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.daos.LoanHelper;
import library.daos.LoanMapDAO;
import library.daos.MemberHelper;
import library.daos.MemberMapDAO;
import library.entities.Loan;
import library.hardware.CardReader;
import library.hardware.Display;
import library.hardware.Printer;
import library.hardware.Scanner;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;
import library.panels.borrow.ScanningPanel;

public class MainPanelTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		// Click borrow.
		Main mainBorrow = new Main();
		mainBorrow.borrowBooks();
		
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

		// Initiate a testing memberID.
		IMember member = memberDAO.addMember("Wing", "Tsoi", "0420654682", "edmondtsoi92@gmail.com");
		int memberID = member.getID();
		// Test passed:
		// assertEquals(EMemberState.BORROWING_ALLOWED, member.getState());
		
		// Swipe card.
		bookScan.initialise();
		bookScan.cardSwiped(memberID);

		// Add the scanning panel.
		ScanningPanel panel = new ScanningPanel(bookScan);
		
		// Display the scanning screen, the user details, and the existing loans.
		display.getDisplay();
		panel.displayMemberDetails(member.getID(), member.getFirstName(), member.getContactPhone());
		panel.displayExistingLoan(member.toString());
		
		// Create a new book and initiate the bookID.
		IBook book = bookDAO.addBook("author", "title", "callNo");
		int bookID = book.getID();
		
		// Scan book.
		bookScan.bookScanned(bookID);
		
		// Display the current book details and the updated pending loan lists.
		panel.displayScannedBookDetails(book.toString());
		Date borrowdate = new Date(1);
		Date returndate = new Date(2);
		Loan loan = new Loan(book ,member, borrowdate, returndate);
		panel.displayPendingLoan(loan.toString());
		
		// Complete scans.
		bookScan.scansCompleted();
		panel.displayConfirmingLoan(loan.toString());
		
		// Confirm loan list and print it.
		bookScan.loansConfirmed();
		printer.print(loan.toString());
	}

}
