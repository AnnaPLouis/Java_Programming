package day08_ternaries;

public class TernariesIntro2 {
    public static void main(String[] args) {

        int number = 100;

        /*String result = "";

        if (number > 0 ){
            result = "pos";
        }else if (number <0 ){
            result = "neg";
        }else {
            result = "zero";
        }

         */

        String result = (number > 0) ? "Pos" : (number < 0) ? "Neg" : "Zero";

        System.out.println(result);

        System.out.println("------------------------------------");


            /*int num = 7;

            if (number == 1){
                System.out.println("Monday");
            }
            if (number == 2){
                System.out.println("Tuesday");
            }
            if (number == 3){
                System.out.println("Wednesday");
            }
            if (number == 4){
                System.out.println("Thursday");
            }
            if (number == 5){
                System.out.println("Friday");
            }
            if (number == 6){
                System.out.println("Saturday");
            }
            if (number == 7){
                System.out.println("Sunday");
            }

             */
        int n = 7;

        String day = (n == 1) ? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday"
                :(n==5)? "Friday" :(n==6)? "Saturday" : "Sunday";

        System.out.println(day);

        }

    }



