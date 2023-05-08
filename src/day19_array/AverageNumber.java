package day19_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum = 0;

        for (int i = 0; i < total; i++) {

            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];

        }

        DecimalFormat df = new DecimalFormat("0.00");

        double average = sum/(double)total;


        System.out.println(sum);
        System.out.println(df.format(average));
    }
}
