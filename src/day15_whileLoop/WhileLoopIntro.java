
package day15_whileLoop;
import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int age = input.nextInt();

        while(age <0 || age >100){
            System.out.println("Invalid entry!");
            age = input.nextInt();

        }


        if (age >= 21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
