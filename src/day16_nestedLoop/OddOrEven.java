package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }

            System.out.println("Would you like to enter another number? Yes/No");

            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no")))
                System.out.println("invalid entry");
            answer = input.next();

            if (answer.equals("no")) {
                break;
            }


        }
    }
}
