package module6;

public class Counter {
	private int count = 0;

	public void resetCounter() {
		count = 0;
	}

	public void increaseCounter() {
		count = count + 1;
	}

	public void decreaseCounter() {
		if (count > 0) {
			count = count - 1;
		} else {
			System.out.println("Counter is zero. A negative counter is not allowed.");
		}

	}

	public int getCounterValue() {
		return count;
	}

	@Override
	public String toString() {
		return "Counter =" + count;
	}

}