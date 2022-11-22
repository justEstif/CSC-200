package module3;

import java.util.Scanner;
public class problem1
{
    public static void main (String [] args)
    {
        double meters, miles, feet, inches;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println ("Hello out there.");
        System.out.println ("I will change meters to miles, feet, and inches for you.");
        System.out.print("Enter your measurement in meters: ");

        meters = keyboard.nextDouble ();
        miles = meters / 1609;
        feet = meters * 3.28;
        inches = meters * 39.37;
        System.out.printf(meters + " m = %.2f",miles);
        System.out.println(" mi");
        System.out.printf(meters + " m = %.2f",feet);
        System.out.println(" ft");
        System.out.printf(meters + " m = %.2f",inches);
        System.out.println(" in");
    }
}
