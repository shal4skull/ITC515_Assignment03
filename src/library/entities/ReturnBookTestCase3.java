package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class ReturnBookTestCase3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//This test tests the case in which borrower return book with LOST state and without DAMAGED state
	//The state of the book should be DAMAGED
	//However, the result is not a DAMAGED state
	//It is AVAILABLE state
	public void testReturnBookTestCase3() {
		Book b = new Book("author1", "title1", "callNo1",1);
		b.state = EBookState.LOST;
		//System.out.println( b.getState());
		b.returnBook(false);
		//System.out.println( b.getState());
		//b.returnBook(true);
		assertEquals(EBookState.DAMAGED, b.getState());
		
		
	}

}
