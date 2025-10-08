package lotterygameusingstring;

import java.util.Scanner;

public class LotteryGameUsingString {

    public static void main(String[] args) {
        // Lottery Game Using String
        String lottery = " " + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two digit ");
        String guess = input.nextLine();

        char lottery1 = lottery.charAt(0);
        char lottery2 = lottery.charAt(1);

        char guess1 = guess.charAt(0);
        char guess2 = guess.charAt(1);
        if (guess.equals(lottery)) {
            System.out.println("the Lottery number is " + lottery + " and your number is " + guess + "  Congratulation you win 10,000$ ");
        } else if (guess1 == lottery2 && guess2 == lottery1) {
            System.out.println("the Lottery number is " + lottery + " and your number is " + guess + "  Congratulation you win 3000$ ");
        } else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2) {
            System.out.println("the Lottery number is " + lottery + " and your number is " + guess + "  Congratulation you win 1000$ ");
        } else {
            System.out.println("the Lottery number is " + lottery + " and your number is " + guess + "  you lose the Game");

        }

    }

}
