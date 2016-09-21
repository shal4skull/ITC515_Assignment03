package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class ReturnBookTestCase1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//This test tests the case in which borrower return book without damaged
	//The state of the book will be Available
	public void testReturnBookTestCase1() {
		Book b = new Book("author1", "title1", "callNo1",1);
		b.state = EBookState.ON_LOAN;
		//System.out.println( b.getState());
		b.returnBook(false);
		//System.out.println( b.getState());
		//b.returnBook(true);
		assertEquals(EBookState.AVAILABLE, b.getState());
		
		
	}

}
