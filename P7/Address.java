package module7;

public class Address {

	private int houseNumber, apartNumber, postalCode;
	private String street, city, state;

	public Address(int houseNumber, String street, int apartNumber, String city, String state, int postalCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.apartNumber = apartNumber;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public Address(int houseNumber, String street, String city, String state, int postalCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public void printAddress() {
		System.out.println(street);
		System.out.println(city + ", " + state + ", " + postalCode);
	}

	public int getPostalCode() {
		return postalCode;
	}

	public boolean comesBefore(Address other) {
		if (postalCode < other.getPostalCode()) {
			return true;
		}
		return false;
	}
}
