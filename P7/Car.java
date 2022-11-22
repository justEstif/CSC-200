package module7;

public class Car {

	private double fuelEfficiency, fuelAmount, fuelUsed;

	public Car(double fuelEfficiency) {
		this.fuelAmount = 0;
		this.fuelEfficiency = fuelEfficiency;
	}

	public void drive(int miles) {
		fuelUsed = miles / fuelEfficiency;
		fuelAmount = fuelAmount - fuelUsed;
	}

	public double getGasLevel() {
		return fuelAmount;
	}
	public void addGas(double fuelAdded) {
		fuelAmount = fuelAmount + fuelAdded;
	}

}
