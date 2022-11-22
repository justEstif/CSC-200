import java.util.Random; //import Random

public class ArrayQuestion1 {
	// set max and min to least and greatest possible values
	int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0, evenSum = 0, oddSum = 0;
	Random rand = new Random(); // create Random object
	int[] intArray = new int[10]; // create array with 10 index

	public void createArray() {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rand.nextInt(100);
		}
		System.out.println("The array created: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println("The elements at the even index: ");
		for (int i = 0; i < intArray.length; i = i + 2) { // add index by 2
			evenSum = evenSum + intArray[i];
			System.out.print(intArray[i] + " ");

		}
		System.out.println();
		System.out.println("The even elements are: ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] >= max) {
				max = intArray[i];
			}
			if (intArray[i] <= min) {
				min = intArray[i];
			}
			if (intArray[i] % 2 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		System.out.println();
		System.out.println("The array in reverse is: ");
		for (int i = intArray.length - 1; i >= 0; i--) { // make i one less then the length b/c array starts from 0
			if (i % 2 != 0) {
				oddSum = oddSum + intArray[i]; // add the elements at odd index together
			}
			sum = sum + intArray[i]; // find sum of all elements
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println("The first element of the array is " + intArray[0]);
		System.out.println("The last element of the array is " + intArray[intArray.length - 1]);
		System.out.println("The max element in the array is " + max);
		System.out.println("The min element in the array is " + min);
		System.out.println("The sum of all elements is " + sum);
		System.out.println("The alternating sum is " + (evenSum - oddSum));
	}

}