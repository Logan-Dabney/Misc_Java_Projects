import java.util.Scanner;

public class ApproxPi {
   // Written By Logan Dabney
   // 1/24/18
   // This programs approximates the value of Pi
   public static void main(String[] args) {
       double Approx;

       Approx = 4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) +
               (1.0 / 9) - (1.0 / 11) + (1.0 / 13));

       System.out.print("The Approximation for Pi is: ");
       System.out.print(Approx);
   }
}

