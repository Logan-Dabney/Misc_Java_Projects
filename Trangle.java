import java.util.*;

public class Trangle {
    // Written by Logan Dabney
    // This program creates a triangle out of x's with the same number of rows as the input.
    // The input must be odd.
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int odd;

        System.out.println("Welcome to the Game of Triangle");
        System.out.print("Please enter an odd number [1-20]: ");
        odd = stdin.nextInt();

        while (odd > 20 || odd < 1 || (odd % 2) == 0) {
            System.out.println("The number must be odd numbers between 1 and 20.");
            System.out.print("Please enter an odd number [1-20]: ");
            odd = stdin.nextInt();
        }

        System.out.println("Thanks, here is the triangle with " + odd + " rows.");

        for (int a = 1; a < (2 * odd); a += 2) {
            for (int b = 0; b < (37 - a) / 2; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < a; c++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
