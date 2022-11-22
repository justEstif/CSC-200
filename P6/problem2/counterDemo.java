package module6;

public class counterDemo{

	public static void main (String[] args)	{
		Counter myCounter = new Counter();
		System.out.println("First value of counter after instantiating the new object is: " + myCounter.getCounterValue());
		System.out.println("Using loop: ");
		for (int x = 0; x < 6; x++){
			myCounter.increaseCounter();
			System.out.println("\tCounter = " + myCounter.getCounterValue());
		}
	
		System.out.println("My counter after using the increase method is " + myCounter.getCounterValue());
		myCounter.resetCounter();
		System.out.println("My counter after being reset is " + myCounter.getCounterValue());
	
		for (int x = 0; x < 5; x++)
		{
			myCounter.decreaseCounter();
			System.out.println(myCounter.getCounterValue());
		}
		
		System.out.println("My counter after using the decrease method is " + myCounter.getCounterValue());
		System.out.println(myCounter);
		myCounter.resetCounter();
	}
}