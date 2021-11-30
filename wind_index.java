import java.util.*;

public class WindChill {
   // Written By Logan Dabney
   // 1/27/18
   // This program calculates the wind chill from inputs:
   // Temperature(Fahrenheit or Celsius) and Wind Velocity(mph)
   public static void main(String[] args) {
       Scanner stdin = new Scanner(System.in);
       double TempF, WindV, TempC, Chill;
       char TorC;

       System.out.println("Would you like to Calculate in Celsius or " +
               "in Fahrenheit? (C or F)");
       TorC = stdin.next().charAt(0);

       if (TorC == 'F' || TorC == 'f') {
           System.out.print("Enter temperature(Fahrenheit): ");
           TempF = stdin.nextDouble();

           System.out.print("Enter wind speed(mph): ");
           WindV = stdin.nextDouble();

           Chill = (int) (35.74 + 0.6251 * TempF - 35.75 * Math.pow(WindV, 0.16) +
                   0.4275 * TempF * Math.pow(WindV, 0.16));
           System.out.print("The wind chill index is ");
           System.out.print((int) Chill);
           System.out.print("°F\n");
       } else {
           System.out.print("Enter temperature(Celsius): ");
           TempC = stdin.nextDouble();

           TempC = (int) ((TempC * 1.8) + 32);

           System.out.print("Enter wind speed(mph): ");
           WindV = stdin.nextDouble();

           Chill = (int) (35.74 + 0.6251 * TempC - 35.75 * Math.pow(WindV, 0.16) +
                   0.4275 * TempC * Math.pow(WindV, 0.16));
           Chill = (Chill - 32) * (5.0 / 9.0);
           System.out.print("The wind chill index is ");
           System.out.print((int) Chill);
           System.out.print("°C\n");
       }
   }
}




import java.util.Scanner;

public class Purchase {
   // Written By Logan Dabney
   // 1/27/18
   // Computes the total purchase price
   // Enter Quantity 5
   // Enter Price 10
   // Total Amount = 50
   public static void main(String[] args) {
       Scanner stdin = new Scanner(System.in);
       int Quantity, Price, Total;
       char yesorno;
       boolean decision;

       do {
           System.out.print("Please enter the Quantity desired: ");
           Quantity = stdin.nextInt();

           System.out.print("Please enter the Unit Price: ");
           Price = stdin.nextInt();

           Total = Price * Quantity;

           System.out.print("The Quantity desired is : ");
           System.out.println(Quantity);
           System.out.print("The Unit Price is       : $");
           System.out.println(Price);
           System.out.print("The Total Amount is     : $");
           System.out.println(Total);
           System.out.println("Would you like to find another Total Purchase" +
                           "Price? (y/n)");
           yesorno = stdin.next().charAt(0);
           decision = (yesorno == 'y');
       }
       while (decision);
       System.out.print("Have a Great Day!\n");
   }
}
