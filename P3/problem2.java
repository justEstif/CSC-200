package module3;

import java.util.Scanner;
public class problem2
{
    public static void main (String [] args)
    {
        int number;
        String numberString;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println ("Hello out there.");
        System.out.println ("I will read an integer, and breaks it into a sequence of individual digits for you.");
        System.out.print("Enter your number: ");

        number = keyboard.nextInt();
        numberString = String.valueOf(number);
        for(int i = 0; i < numberString.length();i++) {
        	System.out.println(numberString.charAt(i));
        }
    }
}
