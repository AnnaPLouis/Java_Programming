package day13_methodsContinue;
import java.util.Scanner;
public class PaymentReturn {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid){
            return;
        }

        System.out.println((grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" :( grade == 'C') ? "Good" :(grade == 'D') ? "Passed" : "Failed");

    }
}
