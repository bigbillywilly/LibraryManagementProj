package libraryManageProj;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class User {

	private String username;
	private String email;
	private String name;
	private final int id;
	private static AtomicInteger nextID = new AtomicInteger(1);

	/**
	 * Constructor to create a user with name, username, and email, auto implements ID number by using a AtomicInteger
	 * @param name
	 * @param username
	 * @param email
	 */
	public User(String name, String username, String email) {
		this.id = nextID.getAndIncrement();
		this.username = username;
		this.email = email;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
