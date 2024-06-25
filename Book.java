package librarymanageproj;

import java.util.GregorianCalendar;

/**
 * A class representing a book, holding data such as the title, author, isbn,
 * availability, date published, and genres
 */
public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean avail;
	private GregorianCalendar publishDate;
	private String[] genres;

	public Book(String title, String author, String isbn, GregorianCalendar publishDate, String g1, String g2,
			String g3) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		avail = true;
		this.publishDate = publishDate;

		String[] genres = new String[3];
		genres[0] = g1;
		genres[1] = g2;
		genres[2] = g3;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void checkout(int days) {
		avail = false;
	}

	public void checkin() {
		avail = true;
	}

	public GregorianCalendar getDate() {
		return publishDate;
	}

	public String[] getGenres() {
		return genres;
	}

}
