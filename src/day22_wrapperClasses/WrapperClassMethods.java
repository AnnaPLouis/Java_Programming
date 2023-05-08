package day22_wrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        int num1 = Integer.parseInt(str);


        System.out.println(num1+1);

        Integer num2 = Integer.valueOf(str);


        char ch = '1';

        boolean isDigit = Character.isDigit(ch);

        char c = 'A';

        boolean isLetter = Character.isLetter(c);

        char h = 'a';

        boolean isLowerCase = Character.isLowerCase(h);

       boolean isUpperCase = Character.isUpperCase(c);

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLowerCase = " + isLowerCase);

        System.out.println("isLetter = " + isLetter);



        String string = "a1b2c3d4e5";

        int sum = 0;

        char [] chars = string.toCharArray();

        for (char each : chars) {

            if (Character.isDigit(each)){

              sum +=  Integer.parseInt(each + "");

            }

        }










    }


}
