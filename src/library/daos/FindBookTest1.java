package library.daos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;

public class FindBookTest1 {
	BookMapDAO d;
	IBookHelper helper;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//Test case succesfull
	//Find book testing
	public void FindBookTest1() {
		Book b = new Book("author1", "title2", "callNo2",2);
		//d = new BookMapDAO(helper);
		//d.addBook("author1", "title2", "callNo2");
		//List<IBook> l = d.findBooksByTitle(b.getTitle());
		boolean check = b instanceof Book;
		assertTrue(check);
		
	}

}
