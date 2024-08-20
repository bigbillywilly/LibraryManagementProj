package libraryManageProj;
import java.util.Calendar;
import java.util.Date;

public class Member extends User {

	public Member(int id, String name, String username, String email) {
		super(name, username, email);
	}

	//we should make this a generic class with generic methods so we can use checkOut on books albums and anything else we want to add.
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
