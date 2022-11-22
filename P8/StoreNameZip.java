import java.util.Scanner;

public class StoreNameZip {
	Scanner keyboard = new Scanner(System.in);
	private int count = 0;
	private String storageName;
	private int[] zipArray = new int[25];
	private String[] fNameArray = new String[25], lNameArray = new String[25];

	public StoreNameZip(String storageName) {
		super();
		this.storageName = storageName;
		intoArray();
	}

	public void intoArray() {
		System.out.println("Welcome, we will be storing your data into " + storageName);
		System.out.println("Please prepare a max of 25 first names, last names and zip codes");
		for (int i = 0; i < zipArray.length; i++) {
			System.out.println("Enter first name(" + i + "): ");
			fNameArray[i] = keyboard.next();
			System.out.println("Enter last name(" + i + "): ");
			lNameArray[i] = keyboard.next();
			System.out.println("Enter zip code(" + i + "): ");
			zipArray[i] = keyboard.nextInt();
			System.out.println("Type '1' to exit, or '0' to continue");
			int quit = keyboard.nextInt();
			if(quit == 1) {
				break; // exit loop
			}
		}
		System.out.println("Here is the created data: ");
		printArray();
	}

	public void printArray() {
		for (int i = 0; i < zipArray.length; i++) {
			System.out.println(fNameArray[i] + " " + lNameArray[i] + " " + zipArray[i]);
		}
	}
}
