package librarymanageproj;

import java.util.GregorianCalendar;

/**
 * A class representing an album, holding data such as the title, artist,
 * release date, label, availability and genres.
 * 
 * @authors Elijah Potter & William Ngo
 * @version July 5, 2024
 */
public class Album extends Media {
	private String label;

	/**
	 * Album constructor
	 * 
	 * @param title       - The name of the media
	 * @param creator     - The name of the main creator
	 * @param releaseDate - The date of public release
	 * @param g1          - First genre
	 * @param g2          - Second genre
	 * @param g3          - Third genre
	 * @param label       - The name of the label
	 */
	public Album(String title, String creator, GregorianCalendar releaseDate, String g1, String g2, String g3,
			String label) {
		super(title, creator, releaseDate, g1, g2, g3);
		this.label = label;
	}

	/**
	 * Returns the label
	 */
	public String getLabel() {
		return label;
	}

}
