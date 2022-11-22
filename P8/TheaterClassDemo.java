import java.util.Scanner;
public class TheaterClassDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TheaterClass theater = new TheaterClass();
		theater.printTheatsSeats();
		System.out.println("Welcome, would you pick a seat or price?\n('1' for price or '2' for seat) ");
		int choice = keyboard.nextInt();
		if(choice == 1) {
			System.out.println("Enter a price: ");
			int price = keyboard.nextInt();
			theater.returnSeat(price);
		}
		else if(choice == 2) {
			System.out.println("Enter row ");
			int row = keyboard.nextInt();
			System.out.println("Enter column");
			int column = keyboard.nextInt();
			theater.returnPrice(row, column);
		}
		else {
			System.out.println("Wrong input");
		}
	}
}
