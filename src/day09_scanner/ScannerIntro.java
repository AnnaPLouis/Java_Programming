package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//keybord input
        System.out.println("Enter a number: ");
        byte num1 = input.nextByte();

        System.out.println("You entered: "+num1);
    }
}
