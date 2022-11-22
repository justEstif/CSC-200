package module7;

public class testRetailItem {
	public static void main(String[] args) {
		RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
		RetailItem designerJeans = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem shirt = new RetailItem("Shirt", 20, 24.95);

		System.out.println(jacket.toString());
		System.out.println(designerJeans.toString());
		System.out.println(shirt.toString());
	}
}
