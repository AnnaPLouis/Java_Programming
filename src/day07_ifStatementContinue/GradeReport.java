package day07_ifStatementContinue;

public class GradeReport {
    public static void main(String[] args) {

        int score = 80;

        String result = "Your grade is ";


        if (score >= 90) {
            result += "A";
        } else if (score>=80) {
            result += "B";
        } else if (score>=70) {
            result += "C";
        } else if (score>=60) {
            result += "D";
        } else{
            result = "Failed";

        }
        System.out.println(result);

    }

    }

