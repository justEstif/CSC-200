package module4;

import java.util.Scanner;

public class problem1EstifanosBeyeneCSC200E80L
{
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	
    	int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,count = 0, age;  //initializing max and min the smallest and largest numbers respectively so they can be replaced immediately. 
    	
    	while(count < 3){  //limit the count to 3 as required by the question
    		System.out.print("Enter age: ");
    		age = keyboard.nextInt();
    		if(age >= max) {
    			max = age;  //set max to the maximum age using if statement
    	}
    		else if (age <= min ) { 
    			min = age;  //set min to the minimum age using if statement
    		}
    		count++;
    	}
    	System.out.println("Max age = " + max);
    	System.out.println("Min age = " + min);
    }
}

