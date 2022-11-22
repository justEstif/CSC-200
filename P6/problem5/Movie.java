package module6;

public class Movie {
	private String movieName, mpaaRating;
	private int terribleCount, badCount, okCount, goodCount, greatCount, count = 0, sum = 0;

	public Movie(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public void addRating(int rating) {
		if (rating >= 1 & rating <= 5) {
			count++;
			if (rating == 1) {
				terribleCount++;
				sum = sum + (terribleCount * 1);
			} else if (rating == 2) {
				badCount++;
				sum = sum + badCount * 2;
			} else if (rating == 3) {
				okCount++;
				sum = sum + okCount * 3;
			} else if (rating == 4) {
				goodCount++;
				sum = sum + goodCount * 4;
			} else if (rating == 5) {
				greatCount++;
				sum = sum + greatCount * 5;
			} else {
				System.out.println("A value not equal to 1 - 5 was enter.");
			}
		}
	}

	public double getAverage() {
		double average = sum / count;
		return average;

	}

}
