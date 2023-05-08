package day11_stringContinue;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first string:");

        String first = input.nextLine();

        System.out.println("Enter your second string:");

        String second = input.nextLine();

        input.close();

        if (first.length() > second.length()){
            System.out.println("first string is longer");
        } else if (first.length() < second.length()) {
            System.out.println("second string is longer");
        }else{
            System.out.println("Equal");
        }

    }
}
