package module3;

import java.util.Scanner;


public class problem5
{
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	String word, last2, first4, last4, first2, right, left;
    	
        System.out.print("Enter a word: ");
        word = keyboard.nextLine();
        last2 = word.substring(word.length()-2);
        first4 = word.substring(0,word.length()-2);
        last4 = word.substring(2,word.length());
        first2 = word.substring(0,2);
        
        right = last2 + first4;
        left = last4 + first2;
        
        System.out.println("Given Term: " + word);
        System.out.println("Right-Shifted: " + right);
        System.out.println("Left-Shifted: "  + left);
    }
}
