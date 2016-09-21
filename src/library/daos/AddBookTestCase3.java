//Author: Tsoi Wing Kui
//Student number: 11593536

package library.daos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.IBook;

public class AddBookTestCase3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddBook() {
		BookHelper b = new BookHelper();
		BookMapDAO a = new BookMapDAO(b);
		IBook book = a.addBook("Wing", "BookTitle","1");
		// Test whether the value of "callNumber" variable is passed into the collection of "Books".  
		assertEquals("1", book.getCallNumber());
	}

}

// The result returns true which is as expected.