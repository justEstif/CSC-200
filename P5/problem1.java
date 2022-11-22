package module5;


import java.util.Scanner;

public class problem1
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float userInput, average = 0, max = Float.MIN_VALUE, min = Float.MAX_VALUE, range = 0;
        int expected, count = 0;
        System.out.println("How many numbers will you be entering?"); //uses this to break the loop
        expected = keyboard.nextInt();
        while(count < expected)//count until the expected amount of numbers
        {
            System.out.println("Enter a number: ");
            userInput = keyboard.nextFloat();
            average = average + userInput;
            if (userInput <= min){
                min = userInput;
            }
            if(userInput >= max){
                max = userInput;
            }
            range = max - min;
            count++;
        }  
    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    System.out.println("Average = " + average);
    System.out.println("Range = " + range);

    }
}