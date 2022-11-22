package module3;

import java.util.Scanner;
public class problem4
{
    public static void main (String [] args)
    {
    	Scanner keyboard = new Scanner (System.in);
    	String city,cityUc, cityLc;
    	char cityFl;
    	int cityLength;
    	
        System.out.println ("Hello out there.");
        System.out.println ("What is your favourite city?");
        System.out.print("Enter name of city: ");
        city = keyboard.nextLine();
        
        cityLength = city.length();
        cityUc = city.toUpperCase();
        cityLc = city.toLowerCase();
        cityFl = city.charAt(0);
        
        System.out.println("The number of characters in the city name is "+ cityLength + ".");
        System.out.println("The name of the city in all uppercase letters " + cityUc + ".");
        System.out.println("The name of the city in all lowercase letters " + cityLc + ".");
        System.out.println("The first character in the name of the city " + cityFl + ".");
    }
}

