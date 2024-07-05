package librarymanageproj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBasics() {
		Book hobbit = new Book("The Hobbit", "JRR Tolkien", new GregorianCalendar(1937, 8, 21), "Fantasy", "Fiction",
				"Adventure", "9780345445605");
		assertEquals("The Hobbit", hobbit.getTitle());
		assertEquals("JRR Tolkien", hobbit.getCreator());
		assertEquals(new GregorianCalendar(1937, 8, 21), hobbit.getDate());

		assertTrue(hobbit.getAvail());
		hobbit.checkout();
		assertFalse(hobbit.getAvail());
		hobbit.checkin();
		assertTrue(hobbit.getAvail());

		assertEquals("[Fantasy, Fiction, Adventure]", hobbit.getGenres().toString());
		assertEquals("9780345445605", hobbit.getIsbn());
		assertEquals("\"The Hobbit\" By JRR Tolkien (September 21, 1937)", hobbit.toString());
	}

}
