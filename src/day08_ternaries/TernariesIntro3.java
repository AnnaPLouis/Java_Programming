package day08_ternaries;

public class TernariesIntro3 {
    public static void main(String[] args) {

        //nested ternary

        int score = 130;

        String result = (score >=0 && score <=100) ?

                (score >=60)? "Passed" : "Failed"

                : "Invalid score";

        System.out.println(result);


        int n = 5;

        String day = (n>=1 && n<=7) ?
                (n==1) ? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)?
                        "Friday" :(n==6)? "Saturday" : "Sunday"
                : "No such day";

        System.out.println(day);







    }
}
