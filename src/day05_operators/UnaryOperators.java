package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = 10;

        System.out.println( ++x);
        System.out.println(x);

        int y = 100;

        System.out.println( --y );
        System.out.println(y);

        // post inc/decrement

        int a = 50;

        System.out.println( a++);
        System.out.println(a);
         int d = 25;
        System.out.println( d--);
        System.out.println(d);

        int n = 30,
                m = n++; //m=30 but n=31
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; //q=60 but z=59


    }
}
