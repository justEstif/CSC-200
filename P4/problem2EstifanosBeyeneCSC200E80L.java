package module4;

import java.util.Scanner;

public class problem2EstifanosBeyeneCSC200E80L {
	public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	String name; 
    	double hourlyWage, hours, salary = 0 ; //set the datatype to double to accept fractional values
    	
    	System.out.print("Enter name: ");
    	name = keyboard.nextLine();
    	System.out.print("Enter hourly wage: ");
    	hourlyWage = keyboard.nextDouble();
    	System.out.print("Enter hours: ");
    	hours = keyboard.nextDouble();
    	
    	if(hours <= 40){
    		salary = hours * hourlyWage;
    	}
    	else if(hours > 40) { //If salary > 40, find the salary for 40 and add with the pay for overtime for the remaining hours
    		salary = (40 * hourlyWage) + ((hours - 40) * (hourlyWage * 1.5)); 
    	}
    	System.out.println(name + " earned $" + salary + " this week.");
    }
}
