package module5;

import java.util.Random;

public class problem5 {
	public static void main(String[] args) {
		Random generator = new Random();
		int x = 0, y = 0, intersections =0;
		boolean traveling = true;
		int[] directions = {-1, 1};
		while(traveling){
			intersections++;
			if (intersections == 100){ //break when it reaches 100 intersections
				break;
			}
		
			int xRandomDirection = directions[generator.nextInt(directions.length)]; //pick x random direction
			x = x + xRandomDirection;
			int yRandomDirection = directions[generator.nextInt(directions.length)];  //pick y random direction
			y = y + yRandomDirection;
		
		}
		System.out.println("(" + x + "," + y + ")"); //print the x, y coorinadates
		
	}
}
