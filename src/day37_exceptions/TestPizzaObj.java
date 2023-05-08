package day37_exceptions;

public class TestPizzaObj {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('M',4, 3);

        Pizza pizza2 = new Pizza('M',4, 3);

        System.out.println(pizza1==pizza2);

    }
}
