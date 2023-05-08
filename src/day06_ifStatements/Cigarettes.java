package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 21  &&  age < 100)
        {
            System.out.println("You are eligble to buy cigarettes");
        }
        if (age < 21  || age > 100){

            System.out.println("You are NOT eligble to buy cigarettes");
        }
    }
}
