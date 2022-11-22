package module6;

public class PairOfDice {
	private int num1, num2;
	private Die die1, die2;

	public PairOfDice(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		die1 = new Die(num1);
		die2 = new Die(num2);
	}

	public void setValue1(int num) {
		die1 = new Die(num);
	}

	public void setVaue2(int num) {
		die2 = new Die(num);
	}

	public int getValue1() {
		return die1.getValue();
	}

	public int getValue2() {
		return die2.getValue();
	}

	public void rollDice() {
		die1.roll();
		die2.roll();
	}

	public int getSumSides() {
		return getValue1() + getValue2();
	}

}
