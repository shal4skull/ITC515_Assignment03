package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class ReturnBookTestCase4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//This test tests the case in which borrower return book with LOST state and with DAMAGED state
	//The state of the book should be DAMAGED
	//the result is a DAMAGED state as expected
	
	public void testReturnBookTestCase3() {
		Book b = new Book("author1", "title1", "callNo1",1);
		b.state = EBookState.LOST;
		//System.out.println( b.getState());
		b.returnBook(true);
		//System.out.println( b.getState());
		//b.returnBook(true);
		assertEquals(EBookState.DAMAGED, b.getState());
		
		
	}

}
