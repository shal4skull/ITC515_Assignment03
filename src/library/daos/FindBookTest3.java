package library.daos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.entities.Book;

public class FindBookTest3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	        //Test case  Not succesfull
			//Find book testing
			public void FindBookTest1() {
				Book b = new Book("author1", "title2", "callNo2",2);
				d = new BookMapDAO(helper);
				d.addBook("author1", "title2", "callNo2");
				assertTrue(check);
	}

}
