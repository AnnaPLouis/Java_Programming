package day07_ifStatementContinue;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 45_000;
        int creditScore = 650;
        String result = "";

        if (salary >= 45_000 && creditScore >= 700) {
            result = "Eligible";
        }else{
            result = "Not eligible";
        }
        System.out.println(result);
    }
}
