package module5;
import java.util.Scanner;
public class problem3{
	//declare the main method
	public static void main(String[] args) {
		int userInput, fold1 = 0, fold2 = 1, foldNew = 0, counter;
		// welcome the user
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input
		// store the user input
		System.out.print("Enter an integer: ");
		userInput = keyboard.nextInt();		
		for (counter = 0; counter < userInput; counter ++){
			foldNew = fold1 + fold2;
			fold2 = fold1;
			fold1 = foldNew;		
		}//input loop END 
		
		System.out.println("The" + counter + "th Fibonacci is: " + foldNew);
		 
	}//main END
}//class END