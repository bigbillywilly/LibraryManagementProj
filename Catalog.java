package libraryManageProj;

import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class Catalog {

	TreeMap<Book, Integer> books;

	public Catalog() {
		this.books = new TreeMap<>();
	}

	public void addBook(Book book) {
		this.books.merge(book, 1, Integer::sum);
	}

	public void addBooks(Collection<? extends Book> pile) {
		pile.forEach(book -> this.books.merge(book, 1, Integer::sum));
	}

	public void removeBook(Book book) {
		this.books.computeIfPresent(book, (key, value) -> (value > 1) ? value - 1 : 0);
	}

	public void removeBooks(Collection<? extends Book> pile) {
		pile.forEach(book -> removeBook(book));
	}

	public TreeSet<Book> searchByTitle() {
		return null;
	}

	public TreeSet<Book> searchByAuthors() {
		return null;
	}
}
