package day16_nestedLoop;

import java.util.Scanner;

public class CalculatorNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter first number:");

            double num1 = input.nextDouble();

            System.out.println("Enter math operator");

            char operator = input.next().charAt(0);

            while (!(operator=='+' || operator=='-'|| operator=='*' || operator=='/')) {
                System.err.println("Invalid operator, try again");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter second number:");
            double num2 = input.nextDouble();

            if (operator=='+') {
                System.out.println(num1 + num2);
            } else if (operator=='-') {
                System.out.println(num1 - num2);
            } else if (operator=='*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("Would you like to continue? Yes/No");

            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid entry");
                 answer = input.next().toLowerCase();}


            if (answer.equals("no")) {
                break;
            }




        }
    }
}
