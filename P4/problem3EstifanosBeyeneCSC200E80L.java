package module4;

import java.util.Scanner;

public class problem3EstifanosBeyeneCSC200E80L {
	public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	double income,tax = 0 ;
    	
    	System.out.print("Enter income: ");
    	income = keyboard.nextDouble(); //income is a double datatype
    	tax = taxes(income); //calls the taxes method with income as the argument
    	System.out.println("Taxes: " + tax);
    }
	static double taxes(double income) {  //create a method to calculate taxes
		double taxes = 0; 
		if(income <= 50000) {
			taxes = income * 0.01;
		}
		else if(income > 50000 || income <= 75000) {
			taxes = income * 0.02;
		}
		else if(income > 75000 || income <= 100000) {
			taxes = income * 0.03;
		}
		else if(income > 100000 || income <= 250000) {
			taxes = income * 0.04;
		}
		else if(income > 250000 || income <= 500000) {
			taxes = income * 0.05;
		}
		else if(income > 500000) {
			taxes = income * 0.06;
		}
		return taxes; //taxes is a double datatype
		}
	}

