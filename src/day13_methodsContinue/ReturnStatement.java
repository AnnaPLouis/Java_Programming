package day13_methodsContinue;

public class ReturnStatement {
    public static void main(String[] args) {


eligible(20);



    }
    public static void eligible (int age){

        if (age< 0 || age >100){
            System.err.println("Invalid age" + age);
            return; // exits the method
        }

        if (age >= 21) {
            System.err.println("Eligible to buy alcohol");
        }else{
            System.err.println("Not eligible to buy alcohol");
        }
    }

    public static int multiplication (int n1, int n2){

        int result = n1 * n2;

        return result;


    }



}
