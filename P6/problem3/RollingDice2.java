package module6;

public class RollingDice2 {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice(5,4);
        System.out.println("value of dice 1" + dice.getValue1());
        dice.setValue1(3);
        System.out.println("value of dice 1 after change " + dice.getValue1());
        System.out.println("value of dice 2 " + dice.getValue2());
        dice.setVaue2(2);
        System.out.println("value of dice 2 after change " + dice.getValue2());
        dice.rollDice();
        System.out.println("sum of dice " + dice.getSumSides());
    }
}
