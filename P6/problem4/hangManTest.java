
package module6;

import java.util.Scanner;

public class hangManTest {
	public static void main(String[] args) {
		String name, input;
		char c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Hangman game.\nPlease enter your name: ");
		name = keyboard.nextLine();
		HangMan user = new HangMan(name);

		System.out.println(name + " guess a letter");
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		c = keyboard.next().trim().charAt(0);
		user.MakeGuess(c);
		System.out.println(user.getDisguisedWord());
		System.out.println("Number of guesses made " + user.getGuessCount());
	}
}
