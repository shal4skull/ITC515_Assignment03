//Author: Tsoi Wing Kui
//Student number: 11593536

package library.daos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import library.interfaces.entities.IBook;

public class AddBookTestCase1 {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	// This test tests the case in which the helper creates a new Book with a unique book ID. 
	public void testAddBook() {
		BookHelper b = new BookHelper();
		BookMapDAO a = new BookMapDAO(b);
		IBook book = a.addBook("Wing", "BookTitle","1");
		// Test whether the value of "Author" variable is passed into the collection of "Books".  
		assertEquals("Wing", book.getAuthor());
	}

}

// The result returns true which is as expected.