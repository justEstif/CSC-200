package module5;

import java.util.Scanner;
public class problem2 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		System.out.println("Enter a word: ");
		word = keyboard.nextLine();
		for(int i = 0;i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

}
