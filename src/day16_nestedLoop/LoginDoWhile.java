package day16_nestedLoop;

import java.util.Scanner;

public class LoginDoWhile {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String u,p;

        int attempt = 3;

        do {
            System.out.println("Enter username:");
            u = input.next();
            System.out.println("Enter password:");
            p = input.next();

            attempt--;

            if (attempt == 0){
                break;
            }

        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));


    }
}
