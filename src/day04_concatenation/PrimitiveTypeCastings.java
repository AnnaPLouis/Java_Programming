package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // -----implicit casting ---------

        byte a = 15;
        short b = a;

        System.out.println(b);

        int c = a;

        long d = 3000L;

        float f = d; // -------implicit casting---------

        //--------explicit casting-------

        int x = 100;
        byte y = (byte)x;

        float z = 20.8f;
        short q = (short)z; // z = 20.8 but q = 20

        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1; //n1=2.5; but n2 = 2

        System.out.println(n2);

        System.out.println("------------------");

        //----------------------------------------

        int num = 500;
        byte result = (byte) num; //num = 500, but result = -12

        System.out.println(result);

        int r = 50000;
        short t = (short) r; //r = 50000, but t = -15536

        System.out.println(t);

        double u = 3000.5;
        int p = (int) u;

        System.out.println(p);

        int o = 100;
        double d1 = o;

        System.out.println(o);







    }
}
