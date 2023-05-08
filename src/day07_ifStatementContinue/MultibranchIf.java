package day07_ifStatementContinue;

public class MultibranchIf {
    public static void main(String[] args) {
         int num = 100;

         String result = "";

         if (num > 0){
             result = "Pos";
         } else if (num < 0) {
             result = "Neg";
         }else{
             result = "Zero";
         }
        System.out.println(result );
    }
}
