package libraryManageProj;

import java.util.GregorianCalendar;

/**
 * A class representing a movie, holding data such as the title, director,
 * release date, production company, availability and genres.
 * 
 * @authors Elijah Potter & William Ngo
 * @version July 5, 2024
 */
public class Movie extends Media {
	private String productionCompany;

	/**
	 * Movie constructor
	 * 
	 * @param title             - The name of the media
	 * @param creator           - The name of the main creator
	 * @param releaseDate       - The date of public release
	 * @param g1                - First genre
	 * @param g2                - Second genre
	 * @param g3                - Third genre
	 * @param productionCompany - The name of the production company
	 */
	public Movie(String title, String creator, GregorianCalendar releaseDate, String g1, String g2, String g3,
			String productionCompany) {
		super(title, creator, releaseDate, g1, g2, g3);
		this.productionCompany = productionCompany;
	}

	/**
	 * Returns the production company
	 */
	public String getProductionCompany() {
		return productionCompany;
	}

}
