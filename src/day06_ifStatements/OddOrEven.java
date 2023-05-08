package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 25;

        boolean even = (number % 2) == 0; // when we devide number by 2 the remainder is zero
        boolean odd = !even;

        System.out.println( number + " is an even number: " + even);
        System.out.println( number + " is an odd number: "+ odd);
    }
}
