package module6;

/*class for a hangman game*/
import java.util.Arrays;

public class HangMan {
	/* the secret word and a disguised word of same length, name of user */
	private String SecretWord = "abracadabra", disguisedWord = "?".repeat(SecretWord.length()), name;
	private char[] secretLetters = SecretWord.toCharArray(), disguisedLetters = disguisedWord.toCharArray();
	char c;// input of user
	private int numberOfGuesses = 0, numberOfIncorrectGuesses = 0,
			maxNumberOfGuesses = (int) (SecretWord.length() * 1.5);

	public HangMan(String name) { // name of user
		this.name = name;
	}

	public String getDisguisedWord() {
		disguisedWord = new String(disguisedLetters); // turns the char array to string
		return disguisedWord;
	}

	public String getSecretWord() {
		return SecretWord;
	}

	public int getGuessCount() { // returns number of guesses made
		return numberOfGuesses;
	}

	public int getNumberOfGuesses() { // returns number of guesses left
		return maxNumberOfGuesses - numberOfGuesses;
	}

	public void MakeGuess(char c) { // user guesses char c
		this.c = c;
		gameDone(); // method to check if game is running
	}

	public boolean isWordFound() {// check if the disguised word and secret word match
		if (disguisedLetters == secretLetters) {

			return true; // you found the word correctly
		}
		return false;// keep trying
	}

	public boolean gameOn() {
		if (getNumberOfGuesses() != 0 || !(isWordFound())) { // if word not found of guesses left
			return true;
		}
		return false;
	}

	private boolean isLetterFound() {// check if the input is part of secret word
		for (int i = 0; i < secretLetters.length; i++) {
			if (secretLetters[i] == c) {
				System.out.println("Correct Guess");
				ifLetterFound();
				return true;
			}
		}
		System.out.println("Incorrect Guess");
		numberOfIncorrectGuesses++;
		return false;
	}

	private void ifLetterFound() {// if letter is part of secret word
		for (int i = 0; i < secretLetters.length; i++) {
			if (secretLetters[i] == c && disguisedLetters[i] != c) {// if character is in secret word and not at index
																	// of disguised word at same time replace it
				disguisedLetters[i] = c;
				break;
			}
		}

	}

	private void gameDone() {
		numberOfGuesses++;// count number of guesses
		if (gameOn()) {
			isLetterFound(); // check if input in secret word
		} else {
			System.out.println(name + " has guessed the word wrong and ran out of guesses.");
		}
	}

}
