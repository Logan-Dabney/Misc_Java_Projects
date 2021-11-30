import java.text.DecimalFormat;
import java.util.*;

public class ParkingGarage {
    // Written by Logan Dabney 2/19/18
    // This program takes in the time each cars was in the parking garage.
    // It then calculates the total hours and the total money made for the day.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hour, TotalH, TotalMoney;
        DecimalFormat df = new DecimalFormat("$##.00");
        DecimalFormat tf = new DecimalFormat("##.#");

        TotalMoney = 0.0;
        TotalH = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the hours parked for car " + i + ": ");
            hour = input.nextDouble();

            TotalH += hour;

            if (hour > 8.0)
                TotalMoney += 12;
            else if (hour <= 2.0)
                TotalMoney += 5;
            else {
                hour -= 2;
                TotalMoney += 5;
                hour = Math.ceil(hour);
                TotalMoney += hour;
            }
        }
        System.out.println("Total Hours " + tf.format(TotalH));
        System.out.print("Total Charge " + df.format(TotalMoney));
    }
}
