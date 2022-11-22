
public class ArrayOperationsDemo {
	public static void main(String[] args) {

		int[][] theaterSeats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };
		ArrayOperations arr = new ArrayOperations();
		System.out.println("Total = " + arr.getTotal(theaterSeats));
		System.out.println("Average = " + arr.getAverage(theaterSeats));
		System.out.println("Get Row Total = " + arr.getRowTotal(theaterSeats, 4));
		System.out.println("Get Column Total = " + arr.getColumnTotal(theaterSeats, 5));
		System.out.println("Get Highest In Row = " + arr.getHighestInRow(theaterSeats, 2));
		System.out.println("Get Lowest in Row = " + arr.getLowestInRow(theaterSeats, 1));
		
	}
}
