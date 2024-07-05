package librarymanageproj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * A super class for all forms of media.
 * 
 * @authors Elijah Potter & William Ngo
 * @version July 5, 2024
 */
public class Media {
	private String title;
	private String creator;
	private GregorianCalendar releaseDate;
	private boolean avail;
	private ArrayList<String> genres;

	/**
	 * Constructor for Media
	 * 
	 * @param title       - The name of the media
	 * @param creator     - The name of the main creator
	 * @param releaseDate - The date of public release
	 * @param g1          - First genre
	 * @param g2          - Second genre
	 * @param g3          - Third genre
	 */
	public Media(String title, String creator, GregorianCalendar releaseDate, String g1, String g2, String g3) {
		this.title = title;
		this.creator = creator;
		this.releaseDate = releaseDate;
		avail = true;

		genres = new ArrayList<>(3);
		this.genres.add(g1);
		this.genres.add(g2);
		this.genres.add(g3);
	}

	/**
	 * Returns the title of the media
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the creator of the media
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Returns the release date of the media
	 */
	public GregorianCalendar getDate() {
		return releaseDate;
	}

	/**
	 * Returns the availability of the media
	 */
	public Boolean getAvail() {
		return avail;
	}

	/**
	 * Sets the availability of the media to false
	 */
	public void checkout() {
		avail = false;
	}

	/**
	 * Sets the availability of the media to true
	 */
	public void checkin() {
		avail = true;
	}

	/**
	 * Returns the genres of the media
	 */
	public ArrayList<String> getGenres() {
		return genres;
	}

	/**
	 * Two pieces of media are considered equal if they have the same name, creator,
	 * and release date.
	 *
	 * @param other - the object being compared with this media
	 * @return true if the other object is a Media type and is equal to this media,
	 *         false otherwise.
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Media))
			return false;
		Media otherMedia = (Media) other;

		if (this.title.equals(otherMedia.getTitle())) {
			if (this.creator.equals(otherMedia.getCreator())) {
				if (this.releaseDate.equals(otherMedia.getDate())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns a textual representation of the media
	 */
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy");
		return "\"" + this.title + "\"" + " By " + this.creator + " (" + format.format(releaseDate.getTime()) + ")";
	}

}
