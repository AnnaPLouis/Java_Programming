package day03_variables;

public class PrimitiveDataTypes2 {

    public static void main(String[] args) {

        char a = '@';
        char b = '!';
        char c = '1';
        // char ab = 'ab'  ---> ERROR

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------");

        char ch1 = 'A';
        char ch2 = 65;

        char ch3 = 40000;

        System.out.println(ch3);


        int sum = 'A' + 'B';

        System.out.println(sum);

        //boolean r1 = 123; ----> error
        //boolean r2 = 2.5; ----> error

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; //true
        boolean r7 = 0 < -1; //false

        System.out.println(r6);
        System.out.println(r7);





    }
}
