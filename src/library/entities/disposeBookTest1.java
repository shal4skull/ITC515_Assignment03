package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class disposeBookTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//this test tests dispose method
	// the expected outcome the book state is DISPOSED
	//The test is successfull
	public void disposeBookTest1() {
		Book b = new Book("author1", "title2", "callNo2",2);
	
		b.dispose();
		assertEquals(EBookState.DAMAGED,b.getState());
		
		
	}

}
