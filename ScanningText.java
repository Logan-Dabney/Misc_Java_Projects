import java.util.*;

public class ScanningText {
    // Written by Logan Dabney 3/12/2018
    // Reads in a line of text. Prints out the length of text.
    // Prints the number of tokens and gives frequency of letters.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line;
        int length, space, token, endLength, count, countFreq;
        char spaceCheck, letterCheck;
        int[] freqNum;

        space = 0;
        countFreq = 0;
        freqNum = new int[26];

        System.out.println("Enter a single line of text:");
        line = input.nextLine().toLowerCase();
        length = line.length();

        for (int i = 0; i < length; i++){
            spaceCheck = line.charAt(i);
             if (spaceCheck == ' '){
                 space++;
             }
        }
        endLength = (length - space) - 1;
        token = space + 1;
        System.out.println("The line contains " + endLength + " letters.");
        System.out.println("The line contains " + token + " string tokens.");

        System.out.println("The frequency of letters is");
        for (int ch = 'a'; ch <= 'z'; ch++, countFreq++){
            count = 0;
            for (int j = 0; j < length; j++){
                letterCheck = line.charAt(j);

                if (letterCheck == (char)ch){
                    count++;
                    freqNum[countFreq] = count;
                }
            }
            if (count > 0)
                System.out.println(Character.toUpperCase((char)ch) + " = " + freqNum[countFreq]);
        }
    }
}
