package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {


            int number = 28;

            boolean even = (number % 2) == 0; // when we devide number by 2 the remainder is zero


            if (even)
            {System.out.println( number + " is an even number");}

            if (!even)

            {System.out.println( number + " is an odd number");}
        }
    }


