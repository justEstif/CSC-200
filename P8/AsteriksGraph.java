import java.util.Scanner;

public class AsteriksGraph {
	int values,  numberOfInputs;
	double max = Double.MIN_VALUE;
	double[] doubleArr;
	String[] strArray, astriexArray;
	Scanner keyboard = new Scanner(System.in);

	public void inputData() {
		System.out.println("Welcome, how many values will you be importing: ");
		numberOfInputs = keyboard.nextInt();
		doubleArr = new double[numberOfInputs];
		strArray = new String[numberOfInputs];
		astriexArray = new String[numberOfInputs];
		// the for loop will store the values and captions into the appropriate array
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.println("Enter caption of " + (i + 1));
			strArray[i] = keyboard.next();
			System.out.println("Enter value of " + (i + 1));
			doubleArr[i] = keyboard.nextInt();

		}
		for (int i = 0; i < doubleArr.length; i++) {
			if (doubleArr[i] >= max) {
				max = doubleArr[i]; // find the max in the array
			}
		}
		for (int i = 0; i < doubleArr.length; i++) {
			int astriexAmount = (int) (40 * doubleArr[i]/max); // find how much percent of the max it is
					// after finding the percent repeat '*' by the proportions amount
			astriexArray[i] = "*".repeat(astriexAmount);
		}
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.println(strArray[i] + " " + astriexArray[i]);
		}
	}
}
