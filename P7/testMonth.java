package module7;

public class testMonth {
	public static void main(String[] args) {
		Month month1 = new Month();
		Month month2 = new Month(3);
		Month month3 = new Month("january");

		System.out.println(month1.getMonthName());
		System.out.println(month1.equals(month3));
		System.out.println(month2.getMonthName());
		System.out.println(month3.toString());
	}
}
