
public class ArrayOperations {

	public int getTotal(int[][] x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < x[i].length; j++) { // this equals to the column in each row.
				total = total + x[i][j]; // adds the value to total
			}
		}
		return total;
	}

	public double getAverage(int[][] x) {
		double total = 0, count = 0;
		for (int i = 0; i < x.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < x[i].length; j++) { // this equals to the column in each row.
				total = total + x[i][j];
				count++;
			}
		}
		return total / count;
	}

	public double getRowTotal(int[][] x, int row) {
		double rowTotal = 0;
		for (int j = 0; j < x[0].length; j++) { // this equals to the column in each row.
			rowTotal = rowTotal + x[row][j]; // stays within one row and change column 
		}
		return rowTotal;
	}

	public double getColumnTotal(int[][] x, int column) {
		double columnTotal = 0;
		for (int j = 0; j < x.length; j++) { // this equals to the column in each row.
			columnTotal = columnTotal + x[j][column];
		}
		return columnTotal;
	}

	public double getHighestInRow(int[][] x, int row) {
		double max = Double.MIN_VALUE;
		for (int j = 0; j < x[0].length; j++) { // this equals to the column in each row.
			if (x[row][j] > max) {
				max = x[row][j]; // save the highest number to max
			}
		}
		return max;
	}

	public double getLowestInRow(int[][] x, int row) {
		double min = Double.MAX_VALUE;
		for (int j = 0; j < x[0].length; j++) { // this equals to the column in each row.
			if (x[row][j] > min) {
				min = x[row][j]; // save the smallest number to min
			}
		}
		return min;
	}

}
