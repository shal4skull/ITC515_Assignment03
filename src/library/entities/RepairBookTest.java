package library.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import library.interfaces.entities.EBookState;

public class RepairBookTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Book b = new Book("author1", "title1", "callNo1",1);
		assertEquals(EBookState.AVAILABLE,b.getState());
	}

}
