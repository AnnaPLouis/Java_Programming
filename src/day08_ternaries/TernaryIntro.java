package day08_ternaries;

public class TernaryIntro {
    public static void main(String[] args) {

        int score = 85;

        String result = "";

        if (score>=60){
            result = "PASSED";
        }else{
            result = "FAILED";
        }
        System.out.println(result);


        String result2  = (score>= 60) ? "PASSED" : "FAILED";


        int age = 16;

        String result3 = (age >=21) ? "Eligible" : "NOt Eligible";

        System.out.println(result3);




    }
}
