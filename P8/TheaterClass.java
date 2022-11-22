
public class TheaterClass {
	int[][] theaterSeats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	public void printTheatsSeats() {
		for (int i = 0; i < theaterSeats.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < theaterSeats[i].length; j++) { // this equals to the column in each row.
				System.out.print(theaterSeats[i][j] + " "); 
			}
			System.out.println(); // change line on console as row comes to end in the matrix.
		}
	}

	public void returnSeat(int price) {
		int row = 0, column = 0;
		if (price < 10 || price > 50) {
			System.out.println("There are no seats with that price");
		} else {
			for (int i = 0; i < theaterSeats.length; i++) { // this equals to the row in our matrix.
				for (int j = 0; j < theaterSeats[i].length; j++) { // this equals to the column in each row.
					if (theaterSeats[i][j] == price) { // if there is a price match, assign those seats
						row = i;
						column = j;
					}
				}
			}
			System.out.println("Avalible seat at (" + row + ", " + column + ")");
			theaterSeats[row][column] = 0; // set that set price to 0
		}
	}

	public void returnPrice(int row, int column) {
		if (row <= 9 & column <= 10) {
			System.out.println("Please pay " + theaterSeats[row + 1][column + 1] + " at the register");
			theaterSeats[row][column] = 0; // set the price to 0
		} else { // if they choose a seat that doesn't exist
			System.out.println("That seats does not exist, please try again");
		}
	}
}