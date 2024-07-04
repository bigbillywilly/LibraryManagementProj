package libraryManageProj;
import java.util.Calendar;
import java.util.Date;

public class member extends User {

	public member(int id, String name, String username, String email) {
		super(name, username, email);
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
