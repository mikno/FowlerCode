package refactoring;

class Rental {
	private final Movie movie;
	private final int daysRented;

	public Rental(Movie newmovie, int newdaysRented) {
		movie = newmovie;
		daysRented = newdaysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	/**
	 * @param thisAmount
	 * @return
	 */
	public double getCharge() {
		return movie.getCharge(getDaysRented());
	}

	/**
	 * @param frequentRenterPoints
	 * @param each
	 * @return
	 */
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoint(getDaysRented());
	}

}