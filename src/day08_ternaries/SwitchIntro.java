package day08_ternaries;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'Q';

        /*
        A
        B
        C
        D
        F
         */

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                


        }






    }
}
