import java.util.*;

public class ValidNum {
    // Written By Logan Dabney 3/8/2018
    // This program reads in a phone number
    // It then checks to see if its the right format ###-###-####
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String phoneNum;
        char check;
        int length;

        System.out.print("Please enter a valid phone number: ");
        phoneNum = input.nextLine();
        length = phoneNum.length();

        if (length != 12){
            System.out.println("This is an incorrect phone number");
            System.exit(0);
        }
        for (int i = 0; i < 11; i++){
            check = phoneNum.charAt(i);

            if(!Character.isDigit(check)){
                if(check == '-'){
                    if (i <= 2 || (i >= 4 && i <= 6) || (i >= 8)){
                        System.out.println("This is an incorrect phone number.");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("This is a correct phone number. (" + phoneNum +
                ") Good Job!");
    }
}
