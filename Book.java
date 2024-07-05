package librarymanageproj;

import java.util.GregorianCalendar;

/**
 * A class representing a book, holding data such as the title, author, isbn,
 * availability, date published, and genres.
 * 
 * @authors Elijah Potter & William Ngo
 * @version July 5, 2024
 */
public class Book extends Media {
	private String isbn;

	/**
	 * Book constructor
	 * 
	 * @param title       - The name of the media
	 * @param creator     - The name of the main creator
	 * @param releaseDate - The date of public release
	 * @param g1          - First genre
	 * @param g2          - Second genre
	 * @param g3          - Third genre
	 * @param isbn        - The ISBN of the book
	 */
	public Book(String title, String author, GregorianCalendar publishDate, String g1, String g2, String g3,
			String isbn) {
		super(title, author, publishDate, g1, g2, g3);
		this.isbn = isbn;
	}

	/**
	 * Returns the ISBN
	 */
	public String getIsbn() {
		return isbn;
	}
}
