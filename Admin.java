package libraryManageProj;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class Admin extends User {

	private String adminID;

	public Admin(String name, String username, String email, String adminID) {
		super(name, username, email);
		this.adminID = adminID;
	}

	public String getAdminID() {
		return this.adminID;
	}

	public void addBook(Catalog catalog, Book book) {
		catalog.addBook(book);
	}

	public void removeBook(Catalog catalog, Book book) {
		catalog.removeBook(book);
	}
	
	public void addBooks(Catalog catalog, Collection<? extends Book> books) {
		catalog.addBooks(books);
	}
	
	public void removeBooks(Catalog catalog, Collection<? extends Book> books) {
		catalog.removeBooks(books);
	}

	public Date checkOutBook(Book book) {

		if (book.getAvail()) {
			book.checkout();
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, 10);

			return cal.getTime();
		}else {
			throw new IllegalStateException();
		}
	}
}
