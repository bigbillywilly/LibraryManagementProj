package librarymanageproj;

import java.util.GregorianCalendar;

/**
 * A class representing an album, holding data such as the title, artist,
 * release date, label, availability and genres.
 * 
 * @authors Elijah Potter & William Ngo
 * @version June 27, 2024
 */
public class Album {
	private String title;
	private String artist;
	private GregorianCalendar releaseDate;
	private String label;
	private String[] genres;
	private boolean avail;

	public Album(String title, String artist, GregorianCalendar releaseDate, String label, String g1, String g2,
			String g3) {
		this.title = title;
		this.artist = artist;
		this.label = label;
		avail = true;
		this.releaseDate = releaseDate;

		String[] genres = new String[3];
		genres[0] = g1;
		genres[1] = g2;
		genres[2] = g3;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	public String getLabel() {
		return label;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void checkout() {
		avail = false;
	}

	public void checkin() {
		avail = true;
	}

	public GregorianCalendar getDate() {
		return releaseDate;
	}

	public String[] getGenres() {
		return genres;
	}
}
