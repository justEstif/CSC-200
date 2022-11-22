package module7;

public class CanSurfaceAreaVol {
	private double height, radius, surfaceArea, volume;

	public CanSurfaceAreaVol(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public double getSurfaceArea() {
		surfaceArea = 2 * Math.pow(radius, 2) * Math.PI + 2 * Math.PI * radius * height;
		return surfaceArea;
	}

	public double getVolume() {
		volume = height * Math.PI * Math.pow(radius, 2);
		return volume;
	}
}
