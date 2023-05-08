package day06_ifStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;

        boolean by2 = number%2 ==0;
        boolean by3 = number%3 ==0;
        boolean by5 = number%5 ==0;

        System.out.println(number +" is divisible by 2: " + by2);
        System.out.println(number +" is divisible by 3: " + by3);
        System.out.println(number +" is divisible by 5: " + by5);
    }
}
