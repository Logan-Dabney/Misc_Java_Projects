import java.util.*;

public class ConvertToUpper {
   // Written By Logan Dabney
   // 1/30/18
   // This program reads a character and gives it equivalent uppercase.
   // If the character is not a letter it will produce and "Error"
   public static void main(String[] args) {
       Scanner stdin = new Scanner(System.in);
       char letter;

       System.out.print("Enter a letter: ");
       letter = stdin.next().charAt(0);

       if (Character.isLetter(letter)) {
           System.out.print("The uppercase equivalent of " + letter + " is ");
           letter = Character.toUpperCase(letter);
           System.out.print(letter);
       } else {
           System.out.println("Not a Letter.");
       }

   }
}
