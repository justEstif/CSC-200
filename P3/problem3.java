package module3;

import java.util.Scanner;
public class problem3
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double gallons, efficiency, price, perHundred, distance;
        
        System.out.println ("Hello out there.");
        System.out.println ("I will read an integer, and breaks it into a sequence of individual digits for you.");
        
        System.out.print("Enter the number of gallons of gas in the tank: ");
        gallons = keyboard.nextDouble();
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        efficiency = keyboard.nextDouble();
        System.out.print("Enter the price of gas per gallon: ");
        price = keyboard.nextDouble();
        
        perHundred = (100 / efficiency) * price;
        distance = gallons * efficiency;
        
        System.out.println("The car can go "+ distance + "mi with the gas in the tank.");
        System.out.printf("The cost per 100 miles is %.2f",perHundred);
    }
}