package module4;

import java.util.Scanner;

public class problem4EstifanosBeyeneCSC200E80L {
	public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	int month;
    	
    	System.out.print("Enter month: ");
    	month = keyboard.nextInt();
    	if ((month == 1) || (month == 3)|| (month == 5)|| (month == 7)|| (month == 8)|| (month == 10)|| (month == 12)){
    		System.out.println("31 days.");
    	}
    	else if (((month == 4)|| (month == 6)|| (month == 9)|| (month == 11))) {
    		System.out.println("30 days.");
    	}
    	else if (month == 2) {
    		System.out.println("28 0r 29 days.");
    	}
    	else { //If input is wrong, set up an else statment to prevent error.
    		System.out.println("Input is not acceptable.");
    	}
    }
}