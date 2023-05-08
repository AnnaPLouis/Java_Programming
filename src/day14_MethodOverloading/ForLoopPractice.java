package day14_MethodOverloading;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 10; i>=5; i--){

            System.out.println("Hello World");
        }

        System.out.println("------------------------------");


        int sum = 0;

        for (int i = 1; i <= 100; i++ ) {

            sum += i;

        }

        System.out.println(sum);

        System.out.println("--------------------------");


        for (char ch = 'A'; ch <= 'Z'; ch++){

            System.out.print(ch + " ");

        }

        System.out.println();
        System.out.println("------------------------------");



        for (char i = 'Z'; i>='A'; i--){

            System.out.print(i + " ");
        }










    }
}
