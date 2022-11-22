package module7;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class testCanSurfaceAreaVol {
	public static void main(String[] args) {
		CanSurfaceAreaVol cylinder = new CanSurfaceAreaVol(5, 4);
		DecimalFormat df = new DecimalFormat("###.###");
		double volume = cylinder.getVolume();
		double surfaceArea = cylinder.getSurfaceArea();
		System.out.println("Volume = " + df.format(volume));
		
		System.out.println("Surface Area = " + df.format(surfaceArea));
		
	}

}
