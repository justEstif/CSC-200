package module7;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String description, int unitsOnHand, double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "RetailItem: "+ description + "\n\tUnitsOnHand: " + unitsOnHand + "\n\tPrice: " + price ;
	}
}
