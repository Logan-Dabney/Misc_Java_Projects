import java.util.*;

public class BinaryConversion {
    // Written by Logan Dabney 3/14/2018
    // This programs reading in a binary number and prints the number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary;
        int decimal;

        binary = "";

        while (!binary.equals("-1")) {
            System.out.print("Please enter a binary number: ");
            binary = input.nextLine();
            if (!binary.equals("-1")) {
                decimal = binaryString(binary);
                System.out.println("Conversion to decimal: " + decimal);
            } else {
                System.out.println("All set!");
            }
        }
    }

    public static int binaryString(String binaryString) {
        int exp, sum;
        char n;

        exp = 0;
        sum = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--, exp++) {
            n = binaryString.charAt(i);
            if (n == '1')
                sum += (int) Math.pow(2, exp);
        }
        return sum;
    }
}