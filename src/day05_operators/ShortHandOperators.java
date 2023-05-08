package day05_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 20;

        System.out.println(a);

        System.out.println(a);

        a = 40;

        System.out.println(a); //will print out last information input

        System.out.println("---------------");

        double balance = 100;
        balance += 1000; //reasinged balance 100 + 1000 = 1100
        balance += 500;

        System.out.println("balance = " + balance);
        System.out.println("---------------");

        balance -= 1000;  // 1600-1000

        System.out.println("balance = " + balance);

        int f = 50;

        f %= 6;

        System.out.println(f);






    }
}
