import java.text.DecimalFormat;
import java.util.*;

public class Reverse {
    // Written By Logan Dabney 3/10/2018
    // This program inputs 8 integers and gives the reverse order.
    // It also gives the mean.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        int [] number;
        int sum;
        double mean;

        sum = 0;

        System.out.print("Please enter 8 positive integers: ");
        number = new int[8];

        for (int i = 0; i <= 7; i++){
            number [i] = input.nextInt();
            sum += number[i];
        }
        reverse(number);
        mean = sum / 8.0;

        System.out.println("The values in reverse " +
                "order are\n" + Arrays.toString(number));
        System.out.println("The average is " + sum + "/8 = " + df.format(mean));
    }
    public static void reverse(int[] array){
        int temp, reverse, count;

        count = 0;

        for(int i = 4; i >= 1; i--, count++){
            temp = array[i + 3];
            reverse = array[count];
            array[i + 3] = reverse;
            array[count] = temp;
        }
    }
}
