package library.entities;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.daos.BookMapDAO;
import library.entities.Book;
import library.interfaces.entities.IBook;



public class ListBookTest {
	//BookMapDAO object = new BookMapDAO (function);
	public static final int List = 0;
	BookMapDAO bm;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		Book ib = new Book("author1", "title1", "callNo1", 1);
		bm.bookMap.put(1, ib);
		assertNotNull(bm.listBooks());
		
	}
		
		
		
}


