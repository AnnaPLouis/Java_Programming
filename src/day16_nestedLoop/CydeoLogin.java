package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your credentials:");
        String username = input.next();
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 2; i++) {

                System.err.println("Wrong credentials. Try again!");
                username = input.next();
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is blocked");
            }

        }
        input.close();


    }

    public static void login(String username, String password) {

        Scanner input = new Scanner(System.in);

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 2; i++) {

                System.err.println("Wrong credentials. Try again!");
                username = input.next();
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is blocked");
            }


        }
    }
}


