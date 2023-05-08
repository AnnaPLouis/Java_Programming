package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 45000;
        int creditScore = 700;
        int age = 16;


        boolean eligibleForLoan = salary>= 30000 || creditScore >= 650 && age >=18;

        System.out.println(eligibleForLoan);


        char grade = 'B';

        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedExam);

        System.out.println(!true);

        String a = "yes";

        boolean yes = a=="yes";
        boolean no =!yes;

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);



    }
}
