package day13_methodsContinue;

public class isOdd {

    public static void main(String[] args) {


      boolean isOdd = isOdd(5);

        System.out.println(isOdd);

        boolean isEven = isEven(6);
        System.out.println(isEven);



    }
    public static boolean isOdd (int number){

        boolean isOdd = number % 2 != 0;
        return isOdd;
    }

    public static boolean isEven (int number){
        return (number % 2 == 0) ? true : false;
    }

    public static boolean isZero (int number){
        return (!isEven(number) && !isOdd(number));
    }
}
