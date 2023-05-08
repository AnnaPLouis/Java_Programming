package day12_customMethods;

public class PassingAgrument {

    public static void main(String[] args) {


        int num1 = 100;
        oddOrEven(num1 );

        int num2 = 23;
        oddOrEven(num2);



    }


    public static void oddOrEven (int num){

        if (num % 2== 0) {
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }

    }
}
