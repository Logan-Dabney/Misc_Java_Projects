import java.util.*;

public class CountingChange {
    // Written by Logan Dabney 2/19/18
    // This program takes an input from the user from 0 to 99.
    // It then asks the user to enter the correct amount of change that will add up to the number entered.
    // If enter an invalid number it will tell the user what they did wrong.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int change, CoinGuess;

        try {
            System.out.print("Enter a change value between 0 and 99: ");
            change = input.nextInt();

            if (change < 0 || change > 99) {
                System.out.println("Error: You must enter a" +
                        " number between 0 and 99.");
                System.exit(0);
            }

            for (int i = 0; i <= 1; i++) {
                CoinGuess = coins();

                if (change == CoinGuess) {
                    System.out.println("Yes, good job!");
                    System.exit(0);
                } else
                    System.out.println("Sorry, that's wrong.");
            }

        } catch (InputMismatchException e) {
            System.out.println("The number you entered was a decimal." +
                    " You must enter a whole number.");
        }
    }

    private static int coins() {
        Scanner input = new Scanner(System.in);
        int sum, numberOf;

        sum = 0;

        System.out.print("How many Half Dollars:");
        numberOf = input.nextInt();
        numberOf *= 50;
        sum += numberOf;

        System.out.print("How many Quarters:");
        numberOf = input.nextInt();
        numberOf *= 25;
        sum += numberOf;

        System.out.print("How many Dimes:");
        numberOf = input.nextInt();
        numberOf *= 10;
        sum += numberOf;

        System.out.print("How many Nickels:");
        numberOf = input.nextInt();
        numberOf *= 5;
        sum += numberOf;

        System.out.print("How many Pennies:");
        numberOf = input.nextInt();
        numberOf *= 1;
        sum += numberOf;
        return sum;
    }
}
