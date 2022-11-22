package module4;

import java.util.Scanner;

public class problem5EstifanosBeyeneCSC200E80L {
	public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	int year;
    	
    	System.out.print("Enter year: ");
    	year = keyboard.nextInt();
    	if ((year % 4 == 0) && (year != 0) && (year % 400 == 0)){
    		System.out.println(year + " is a leap year.");
    	}
    	else {
    		System.out.println(year + " is not a leap year.");
    	}
    }
}