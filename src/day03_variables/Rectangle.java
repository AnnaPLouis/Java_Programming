package day03_variables;

public class Rectangle {

    public static void main(String[] args) {

        int width = 5;
        int length = 7;
        int area = width * length;

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println();
        System.out.println("       " + length);
        System.out.println("--------------------");
        System.out.println("|                  |");
        System.out.println("|       |" +area+ "|       | " + width);
        System.out.println("|                  |");
        System.out.println("--------------------");



    }
}
