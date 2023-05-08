package day13_methodsContinue;

public class Calculate {
    public static void main(String[] args) {


        calculate(20,30,'+');


    }

    public static void calculate(double n1, double n2, char op) {

        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("invalid operator");


        }
    }
}