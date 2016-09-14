package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class ReturnBookTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReturnBook() {
		Book b = new Book("author1", "title1", "callNo1",1);
		b.returnBook(true);
		assertEquals(EBookState.DAMAGED, b.state.DAMAGED);
		
		
	}

}
