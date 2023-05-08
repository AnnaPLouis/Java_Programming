package day11_stringContinue;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string");

        String str = input.nextLine();

        if (str.length() >=1){
            char f = str.charAt(0);

            if (f >=48 && f <=57){
                System.out.println("Digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("Upper case");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("Lower case");
            }else{
                System.out.println("Special character");
            }


        }else{
            System.out.println("string is empty");
        }



    }
}
