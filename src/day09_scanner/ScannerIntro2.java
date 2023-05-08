package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");

        char ch = input.next().charAt(0);
        System.out.println("Your character: "+ ch);

        System.out.println("Type your answer:");

        String answer = input.next();

        System.out.println( "Answer is: " + answer);

        input.close();

    }
}
