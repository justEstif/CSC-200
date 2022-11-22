package module6;

public class FlightTest {
	public static void main(String[] args) {
		Flight flight1 = new Flight("Alaska Airlines", "Los Angeles", "Chicago", 312);
		Flight flight2 = new Flight("Allegiant Air", "New York", "Singapore", 313);
		Flight flight3 = new Flight("JetBlue", "New Delhi", "New York", 443);
		Flight flight4 = new Flight("Southwest Airlines", "Paris", "New Delhi", 323);
		Flight flight5 = new Flight("Bamboo Airways", "Chicago", "New Delhi", 542);

		System.out.println(flight1);
		System.out.println(flight2);
		System.out.println(flight3);
		System.out.println(flight4);
		System.out.println(flight5);
		System.out.println();

		System.out.print("Flight 1:\nOld flight number: " + flight1.getFlightNumber());
		flight1.setFlightNumber(123);
		System.out.println("\nNew flight number: " + flight1.getFlightNumber());

		System.out.print("Flight 5: \nOld destination place: " + flight5.getDestination());
		flight5.setDestination("Moscow");
		System.out.println("\nNew destination place: " + flight5.getDestination());

	}

}