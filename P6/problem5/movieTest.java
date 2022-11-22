package module6;

public class movieTest {
	public static void main(String[] args) {
		Movie movie1, movie2;
		System.out.println("Welcome to Movie Ratings.");
		movie1 = new Movie("Harry Potter");
		movie1.setMpaaRating("PG");
		movie2 = new Movie("Intermission");
		movie2.setMpaaRating("R");

		movie1.addRating(2);
		movie1.addRating(5);
		movie1.addRating(4);
		movie1.addRating(3);
		movie1.addRating(2);
		System.out.println("The MPAA rating of " + movie1.getMovieName() + " is " + movie1.getMpaaRating());
		System.out.println("The average rating is " + movie1.getAverage());
		movie2.addRating(4);
		movie2.addRating(1);
		movie2.addRating(2);
		movie2.addRating(1);
		movie2.addRating(3);
		double movie2Avg = movie2.getAverage();
		System.out.println("The MPAA rating of " + movie2.getMovieName() + " is " + movie2.getMpaaRating());
		System.out.println("The average score is " + movie2.getAverage());
	}

}
