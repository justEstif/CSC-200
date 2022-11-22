package module7;

import java.util.Objects;

public class Month {
	private int monthNumber;
	private String monthName;

	public Month() {
		this.monthNumber = 1;
	}

	public Month(int monthNumber) {
		if (monthNumber >= 1 || monthNumber <= 12) {
			this.monthNumber = monthNumber;
		} else {
			this.monthNumber = 1;
		}
		this.monthName = setMonthName(monthNumber);
	}

	public Month(String monthName) {

		switch (monthName.toLowerCase()) {
		case "january":
			this.monthName = monthName;
			this.monthNumber = 1;
			break;
		case "february":
			this.monthName = monthName;
			this.monthNumber = 2;
			break;
		case "march":
			this.monthName = monthName;
			this.monthNumber = 3;
			break;
		case "april":
			this.monthName = monthName;
			this.monthNumber = 4;
			break;
		case "may":
			this.monthName = monthName;
			this.monthNumber = 5;
			break;
		case "june":
			this.monthName = monthName;
			this.monthNumber = 6;
			break;
		case "july":
			this.monthName = monthName;
			this.monthNumber = 7;
			break;
		case "august":
			this.monthName = monthName;
			this.monthNumber = 8;
			break;
		case "september":
			this.monthName = monthName;
			this.monthNumber = 9;
			break;
		case "october":
			this.monthName = monthName;
			this.monthNumber = 10;
			break;
		case "november":
			this.monthName = monthName;
			this.monthNumber = 11;
			break;
		case "december":
			this.monthNumber = 12;
			this.monthName = monthName;
			break;
		default:
			System.out.println("Not a month!");
			break;
		}
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		if (monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = monthNumber;
		} else {
			this.monthNumber = 1;
		}
	}

	public String getMonthName() {
		this.monthName = setMonthName(monthNumber);
		return monthName;
	}

	@Override
	public String toString() {
		return monthName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return monthNumber == other.monthNumber;
	}

	public boolean greaterThan(Month other) {
		if (this.monthNumber > other.getMonthNumber()) {
			return true;
		}
		return false;
	}

	public boolean lessThan(Month other) {
		if (this.monthNumber < other.getMonthNumber()) {
			return true;
		}
		return false;
	}

	private String setMonthName(int monthNumber) {
		switch (monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "Invalid month";
			break;
		}
		return monthName;
	}

}
