package day13_methodsContinue;

public class AgeGroup {
    public static void main(String[] args) {

     ageGroup(44);


    }
    public static void ageGroup (int age){

        if (age >= 0 && age <=100) {

            System.out.println( (age <= 21)? "teenage" :(age<= 55) ? "adult" : "senior");


        }else{
            System.out.println("Invalid age");
        }


    }
}
