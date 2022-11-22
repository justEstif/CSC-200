package module7;

public class testAddress {
	public static void main(String[] args) {
		Address address1 = new Address(201, "This street", 345, "This city", "BA", 22657); 
		Address address2 = new Address(201, "This street", 345, "This city", "BA", 22647);
		address1.printAddress();
		System.out.println(address1.comesBefore(address2));
	}
}
