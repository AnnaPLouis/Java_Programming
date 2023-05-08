package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = true;

        for (; condition; ) {
            System.out.println("hello for");

        }
        while (condition){
            System.out.println("hello while");
        }

        do {
            System.out.println("hello dowhile");
        }while (condition);


    }
}
