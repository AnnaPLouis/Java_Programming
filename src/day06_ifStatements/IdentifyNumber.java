package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = -201;
        boolean positive = number > 0;
        boolean negative = !positive;
        boolean zero = !positive && !negative;

        System.out.println(number + " is positive number: "+ positive);
        System.out.println(number + " is negative number: "+ negative);
        System.out.println(number + " is zero: "+ zero);
    }
}
